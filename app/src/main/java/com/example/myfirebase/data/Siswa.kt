package com.example.myfirebase.data

import kotlinx.serialization.Serializable

@Serializable
//RAM
data class Siswa(
    val id : Long = 0,
    val nama : String = "",
    val alamat : String = "",
    val telpon : String = "",
)

//UI
data class UIStateSiswa(
    val detailSiswa: DetailSiswa = DetailSiswa(),
    val isEntryValid: Boolean = false
)

//server
data class DetailSiswa(
    val id : Long = 0,
    val nama : String = "",
    val alamat : String = "",
    val telpon : String = "",
)

fun DetailSiswa.toDataSiswa(): Siswa = Siswa(
    id = id,
    nama = nama,
    alamat = alamat,
    telpon = telpon
)

fun Siswa.toUiStateSiswa(isEntryValid: Boolean = false): UIStateSiswa = UIStateSiswa (
    detailSiswa = this.toDetailSiswa(),
    isEntryValid = isEntryValid
)

fun Siswa.toDetailSiswa(): DetailSiswa = DetailSiswa(
    id = id,
    nama = nama,
    alamat = alamat,
    telpon = telpon
)