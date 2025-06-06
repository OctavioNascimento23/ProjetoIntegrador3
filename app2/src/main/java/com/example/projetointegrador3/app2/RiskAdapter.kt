package com.example.projetointegrador3.app2

import android.view.LayoutInflater
import android.view.ViewGroup
import android.widget.ArrayAdapter
import androidx.recyclerview.widget.RecyclerView
import com.example.projetointegrador3.app2.databinding.ItemRiskBinding

class RiskAdapter(
    private val risks: List<Risco>,
    private val onRiskUpdated: (Risco) -> Unit
) : RecyclerView.Adapter<RiskAdapter.RiskViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RiskViewHolder {
        val binding = ItemRiskBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return RiskViewHolder(binding)
    }

    override fun onBindViewHolder(holder: RiskViewHolder, position: Int) {
        holder.bind(risks[position])
    }

    override fun getItemCount(): Int = risks.size

    inner class RiskViewHolder(private val binding: ItemRiskBinding) : RecyclerView.ViewHolder(binding.root) {
        fun bind(risk: Risco) {
            binding.apply {
                riskTitle.setText(risk.titulo)
                riskDescription.setText(risk.descricao)

                // Configurar Spinner de Status
                val statusOptions = listOf("Aberto", "Em Progresso", "Concluído")
                val statusAdapter = ArrayAdapter(binding.root.context, android.R.layout.simple_spinner_item, statusOptions)
                statusAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item)
                riskStatus.adapter = statusAdapter
                riskStatus.setSelection(statusOptions.indexOf(risk.status))

                // Configurar Spinner de Severidade
                val severityOptions = listOf("Baixa", "Média", "Alta")
                val severityAdapter = ArrayAdapter(binding.root.context, android.R.layout.simple_spinner_item, severityOptions)
                severityAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item)
                riskSeverity.adapter = severityAdapter
                riskSeverity.setSelection(severityOptions.indexOf(risk.severidade))

                updateButton.setOnClickListener {
                    val updatedRisk = risk.copy(
                        titulo = riskTitle.text.toString(),
                        descricao = riskDescription.text.toString(),
                        status = riskStatus.selectedItem.toString(),
                        severidade = riskSeverity.selectedItem.toString()
                    )
                    onRiskUpdated(updatedRisk)
                }
            }
        }
    }
}