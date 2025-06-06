package com.example.projetointegrador3

import android.content.Intent
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.google.firebase.auth.FirebaseAuth
import com.example.projetointegrador3.databinding.ActivityLoginBinding

class LoginActivity : AppCompatActivity() {

    private lateinit var binding: ActivityLoginBinding
    private lateinit var auth: FirebaseAuth

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityLoginBinding.inflate(layoutInflater)
        setContentView(binding.root)

        // Inicializa o FirebaseAuth
        try {
            auth = FirebaseAuth.getInstance()
            Log.d("LoginActivity", "FirebaseAuth inicializado com sucesso")
        } catch (e: Exception) {
            Log.e("LoginActivity", "Erro ao inicializar FirebaseAuth: ${e.message}")
            Toast.makeText(this, "Erro ao inicializar Firebase", Toast.LENGTH_SHORT).show()
            return
        }

        binding.loginButton.setOnClickListener {
            val email = binding.emailEditText.text.toString()
            val password = binding.passwordEditText.text.toString()

            if (email.isEmpty() || password.isEmpty()) {
                Toast.makeText(this, "Preencha todos os campos", Toast.LENGTH_SHORT).show()
            } else if (!android.util.Patterns.EMAIL_ADDRESS.matcher(email).matches()) {
                Toast.makeText(this, "Por favor, insira um e-mail válido", Toast.LENGTH_SHORT).show()
            } else {
                // Exibe o progresso enquanto autentica
                binding.progressBar.visibility = View.VISIBLE

                auth.signInWithEmailAndPassword(email, password)
                    .addOnCompleteListener { task ->
                        if (!isFinishing) {
                            binding.progressBar.visibility = View.GONE
                        }

                        if (task.isSuccessful) {
                            Log.d("LoginActivity", "Login bem-sucedido")
                            startActivity(Intent(this, MainActivity::class.java))
                            finish()
                        } else {
                            Log.e("LoginActivity", "Erro no login: ${task.exception?.message}")
                            Toast.makeText(this, "Erro: ${task.exception?.message}", Toast.LENGTH_SHORT).show()
                        }
                    }
                    .addOnFailureListener { exception ->
                        if (!isFinishing) {
                            binding.progressBar.visibility = View.GONE
                        }
                        Log.e("LoginActivity", "Exceção no login: ${exception.message}")
                        Toast.makeText(this, "Erro inesperado: ${exception.message}", Toast.LENGTH_SHORT).show()
                    }
            }
        }
    }
}