package com.example.projetointegrador3.app2

import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.projetointegrador3.app2.databinding.ActivityRiskListBinding
import com.google.firebase.database.*

class RiskListActivity : AppCompatActivity() {
    private lateinit var binding: ActivityRiskListBinding
    private lateinit var database: DatabaseReference
    private lateinit var riskAdapter: RiskAdapter
    private val riskList = mutableListOf<Risco>()
    private var valueEventListener: ValueEventListener? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityRiskListBinding.inflate(layoutInflater)
        setContentView(binding.root)

        database = FirebaseDatabase.getInstance().reference.child("riscos")
        setupRecyclerView()
        fetchRisks()
    }

    private fun setupRecyclerView() {
        riskAdapter = RiskAdapter(riskList, ::onRiskUpdated)
        binding.riskRecyclerView.apply {
            layoutManager = LinearLayoutManager(this@RiskListActivity)
            adapter = riskAdapter
        }
    }

    private fun fetchRisks() {
        valueEventListener = object : ValueEventListener {
            override fun onDataChange(snapshot: DataSnapshot) {
                if (!isFinishing) {
                    riskList.clear()
                    for (riskSnapshot in snapshot.children) {
                        try {
                            val risk = riskSnapshot.getValue(Risco::class.java)
                            if (risk != null) {
                                risk.id = riskSnapshot.key ?: ""
                                riskList.add(risk)
                            }
                        } catch (e: Exception) {
                            e.printStackTrace()
                        }
                    }
                    riskAdapter.notifyDataSetChanged()
                }
            }

            override fun onCancelled(error: DatabaseError) {
                if (!isFinishing) {
                    Toast.makeText(this@RiskListActivity, "Erro ao carregar riscos: ${error.message}", Toast.LENGTH_SHORT).show()
                }
            }
        }
        database.addValueEventListener(valueEventListener!!)
    }

    private fun onRiskUpdated(risk: Risco) {
        val riskId = risk.id
        if (riskId.isEmpty()) {
            Toast.makeText(this, "ID do risco inválido.", Toast.LENGTH_SHORT).show()
            return
        }

        val updates = mapOf(
            "status" to risk.status,
            "severidade" to risk.severidade,
            "descricao" to risk.descricao,
            "titulo" to risk.titulo
        )

        database.child(riskId).updateChildren(updates)
            .addOnSuccessListener {
                if (!isFinishing) {
                    Toast.makeText(this, "Risco atualizado com sucesso!", Toast.LENGTH_SHORT).show()
                }
            }
            .addOnFailureListener {
                if (!isFinishing) {
                    Toast.makeText(this, "Erro ao atualizar risco.", Toast.LENGTH_SHORT).show()
                }
            }
    }

    override fun onDestroy() {
        super.onDestroy()
        valueEventListener?.let { database.removeEventListener(it) }
    }
}