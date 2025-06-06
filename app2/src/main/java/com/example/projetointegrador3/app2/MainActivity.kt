package com.example.projetointegrador3.app2

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.projetointegrador3.app2.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        setupNavigation()
    }

    private fun setupNavigation() {
        // Navegação para o Mapa de Riscos
        binding.btnRiskMap.setOnClickListener {
            val intent = Intent(this, RiskMapActivity::class.java)
            startActivity(intent)
        }

        // Navegação para os Gráficos e Estatísticas
        binding.btnGenerateReport.setOnClickListener {
            val intent = Intent(this, ReportGenerationActivity::class.java)
            startActivity(intent)
        }

        // Navegação para a Listagem de Riscos
        binding.btnRiskList.setOnClickListener {
            val intent = Intent(this, RiskListActivity::class.java)
            startActivity(intent)
        }
    }
}