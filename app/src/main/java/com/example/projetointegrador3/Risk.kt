package com.example.projetointegrador3

data class Risk(
    var id: String = "",
    var descricao: String = "",
    var status: String = "",
    var severidade: String = "",
    var titulo: String = "",
    var timestamp: String = "",
    var latitude: Double = 0.0,
    var longitude: Double = 0.0,
    var imagemUrl: String? = null
)