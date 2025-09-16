package com.example.myfirebase.route

import com.example.myfirebase.R
import com.example.myfirebase.repositori.route.DestinasiNavigasi

object DestinasiDetail: DestinasiNavigasi {
    override val route = "detail_siswa"
    override val titleRes = R.string.detail_siswa
    const val itemIdArg = "idSiswa"
    val routeWithArg = "$route/{$itemIdArg}"
}