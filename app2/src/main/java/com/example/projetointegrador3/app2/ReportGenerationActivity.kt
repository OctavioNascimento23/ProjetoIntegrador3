package com.example.projetointegrador3.app2

import android.graphics.Color
import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.example.projetointegrador3.app2.databinding.ActivityReportGenerationBinding
import com.github.mikephil.charting.components.XAxis
import com.github.mikephil.charting.data.BarData
import com.github.mikephil.charting.data.BarDataSet
import com.github.mikephil.charting.data.BarEntry
import com.github.mikephil.charting.data.PieData
import com.github.mikephil.charting.data.PieDataSet
import com.github.mikephil.charting.data.PieEntry
import com.github.mikephil.charting.formatter.IndexAxisValueFormatter
import com.google.firebase.database.FirebaseDatabase
import java.text.SimpleDateFormat
import java.util.Locale

class ReportGenerationActivity : AppCompatActivity() {
    private lateinit var binding: ActivityReportGenerationBinding
    private lateinit var database: FirebaseDatabase

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityReportGenerationBinding.inflate(layoutInflater)
        setContentView(binding.root)

        database = FirebaseDatabase.getInstance()
        setupCharts()
        loadData()
    }

    private fun setupCharts() {
        binding.barChart.apply {
            description.isEnabled = false
            setDrawGridBackground(false)
            setDrawBarShadow(false)
            setScaleEnabled(true)
            setPinchZoom(false)

            xAxis.apply {
                position = XAxis.XAxisPosition.BOTTOM
                granularity = 1f
                setDrawGridLines(false)
            }

            axisLeft.apply {
                setDrawGridLines(true)
                axisMinimum = 0f
            }

            axisRight.isEnabled = false
            legend.isEnabled = true
        }

        binding.pieChart.apply {
            description.isEnabled = false
            isDrawHoleEnabled = true
            setHoleColor(Color.WHITE)
            setTransparentCircleRadius(30f)
            setDrawCenterText(true)
            rotationAngle = 0f
            isRotationEnabled = true
            isHighlightPerTapEnabled = true
            legend.isEnabled = true
        }
    }

    private fun loadData() {
        val risksRef = database.getReference("riscos")
        risksRef.get().addOnSuccessListener { dataSnapshot ->
            val severityCount = mutableMapOf<String, Int>()
            val dateCount = mutableMapOf<String, Int>()

            dataSnapshot.children.forEach { child ->
                val severity = child.child("severidade").getValue(String::class.java) ?: "Médio"
                severityCount[severity] = (severityCount[severity] ?: 0) + 1

                val timestamp = child.child("timestamp").getValue(String::class.java)
                val dateStr = timestamp?.split(" ")?.get(0) ?: "Não especificado"
                dateCount[dateStr] = (dateCount[dateStr] ?: 0) + 1
            }

            updatePieChart(severityCount)
            updateBarChart(dateCount)
        }.addOnFailureListener { e ->
            Toast.makeText(
                this,
                "Erro ao carregar dados: ${e.message}",
                Toast.LENGTH_LONG
            ).show()
        }
    }

    private fun updatePieChart(severityCount: Map<String, Int>) {
        val entries = severityCount.map { PieEntry(it.value.toFloat(), it.key) }
        val dataSet = PieDataSet(entries, "Severidade dos Riscos")
        dataSet.colors = listOf(
            Color.rgb(255, 99, 132),
            Color.rgb(255, 159, 64),
            Color.rgb(255, 205, 86)
        )

        binding.pieChart.data = PieData(dataSet)
        binding.pieChart.invalidate()
    }

    private fun updateBarChart(dateCount: Map<String, Int>) {
        val entries = dateCount.entries.mapIndexed { index, entry ->
            BarEntry(index.toFloat(), entry.value.toFloat())
        }

        val dataSet = BarDataSet(entries, "Riscos por Data")
        dataSet.color = Color.rgb(54, 162, 235)

        binding.barChart.data = BarData(dataSet)
        binding.barChart.xAxis.valueFormatter = IndexAxisValueFormatter(dateCount.keys.toList())
        binding.barChart.invalidate()
    }
}