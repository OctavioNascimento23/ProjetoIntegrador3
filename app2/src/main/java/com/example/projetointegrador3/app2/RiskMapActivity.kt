package com.example.projetointegrador3.app2

import android.Manifest
import android.content.pm.PackageManager
import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.core.app.ActivityCompat
import androidx.core.content.ContextCompat
import com.example.projetointegrador3.app2.databinding.ActivityRiskMapBinding
import com.google.android.gms.maps.CameraUpdateFactory
import com.google.android.gms.maps.GoogleMap
import com.google.android.gms.maps.OnMapReadyCallback
import com.google.android.gms.maps.SupportMapFragment
import com.google.android.gms.maps.model.LatLng
import com.google.android.gms.maps.model.MarkerOptions
import com.google.firebase.database.FirebaseDatabase

class RiskMapActivity : AppCompatActivity(), OnMapReadyCallback {
    private lateinit var binding: ActivityRiskMapBinding
    private lateinit var map: GoogleMap

    companion object {
        private const val LOCATION_PERMISSION_REQUEST_CODE = 1
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityRiskMapBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val mapFragment = supportFragmentManager
            .findFragmentById(R.id.map) as SupportMapFragment
        mapFragment.getMapAsync(this)
    }

    override fun onMapReady(googleMap: GoogleMap) {
        map = googleMap
        enableMyLocation()

        loadRiskLocations()
    }

    private fun enableMyLocation() {
        if (ContextCompat.checkSelfPermission(this, Manifest.permission.ACCESS_FINE_LOCATION)
            == PackageManager.PERMISSION_GRANTED) {
            map.isMyLocationEnabled = true
        } else {
            ActivityCompat.requestPermissions(
                this,
                arrayOf(Manifest.permission.ACCESS_FINE_LOCATION),
                LOCATION_PERMISSION_REQUEST_CODE
            )
        }
    }

    private fun loadRiskLocations() {
        val database = FirebaseDatabase.getInstance()
        val riscosRef = database.getReference("riscos")

        riscosRef.get().addOnSuccessListener { dataSnapshot ->
            if (dataSnapshot.exists()) {
                println("Documentos carregados: ${dataSnapshot.childrenCount}") // Log para depuração
                for (child in dataSnapshot.children) {
                    val latitude = child.child("latitude").getValue(Double::class.java) ?: continue
                    val longitude = child.child("longitude").getValue(Double::class.java) ?: continue
                    val descricao = child.child("descricao").getValue(String::class.java) ?: "Descrição não disponível"
                    val titulo = child.child("titulo").getValue(String::class.java) ?: "Sem título"

                    val location = LatLng(latitude, longitude)
                    map.addMarker(
                        MarkerOptions()
                            .position(location)
                            .title(titulo)
                            .snippet(descricao)
                    )
                }
                // Centraliza o mapa no primeiro marcador, se houver
                val firstChild = dataSnapshot.children.firstOrNull()
                if (firstChild != null) {
                    val firstLatitude = firstChild.child("latitude").getValue(Double::class.java) ?: 0.0
                    val firstLongitude = firstChild.child("longitude").getValue(Double::class.java) ?: 0.0
                    val firstLocation = LatLng(firstLatitude, firstLongitude)
                    map.moveCamera(CameraUpdateFactory.newLatLngZoom(firstLocation, 12f))
                }
            } else {
                println("Nenhum documento encontrado.") // Log para depuração
            }
        }.addOnFailureListener { e ->
            println("Erro ao carregar documentos: ${e.message}") // Log de erro
            Toast.makeText(this, "Erro ao carregar riscos: ${e.message}", Toast.LENGTH_LONG).show()
        }
    }

    override fun onRequestPermissionsResult(
        requestCode: Int,
        permissions: Array<String>,
        grantResults: IntArray
    ) {
        super.onRequestPermissionsResult(requestCode, permissions, grantResults)
        if (requestCode == LOCATION_PERMISSION_REQUEST_CODE) {
            if (grantResults.isNotEmpty() && grantResults[0] == PackageManager.PERMISSION_GRANTED) {
                enableMyLocation()
            } else {
                Toast.makeText(this, "Permissão de localização necessária", Toast.LENGTH_LONG).show()
            }
        }
    }
}