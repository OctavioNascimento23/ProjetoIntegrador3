package com.example.projetointegrador3

import android.content.Intent
import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.projetointegrador3.databinding.ActivityViewRisksBinding
import com.google.firebase.database.*

class ViewRisksActivity : AppCompatActivity() {

    private lateinit var binding: ActivityViewRisksBinding
    private lateinit var database: DatabaseReference
    private val risksList = mutableListOf<Risk>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityViewRisksBinding.inflate(layoutInflater)
        setContentView(binding.root)

        database = FirebaseDatabase.getInstance().reference.child("riscos")

        binding.risksRecyclerView.layoutManager = LinearLayoutManager(this)
        val adapter = RisksAdapter(risksList)
        binding.risksRecyclerView.adapter = adapter

        fetchRisks(adapter)

        binding.backToMainButton.setOnClickListener {
            startActivity(Intent(this, MainActivity::class.java))
            finish()
        }
    }

    private fun fetchRisks(adapter: RisksAdapter) {
        database.addValueEventListener(object : ValueEventListener {
            override fun onDataChange(snapshot: DataSnapshot) {
                risksList.clear()
                for (riskSnapshot in snapshot.children) {
                    try {
                        val risk = riskSnapshot.getValue(Risk::class.java)
                        if (risk != null) {
                            risk.id = riskSnapshot.key ?: ""
                            risksList.add(risk)
                        }
                    } catch (e: Exception) {
                        e.printStackTrace()
                    }
                }
                adapter.notifyDataSetChanged()
            }

            override fun onCancelled(error: DatabaseError) {
                Toast.makeText(this@ViewRisksActivity, "Erro ao carregar riscos.", Toast.LENGTH_SHORT).show()
            }
        })
    }
}