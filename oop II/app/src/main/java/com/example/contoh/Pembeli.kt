package com.example.contoh

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "Semar_Susu")
data class Pembeli(
    @PrimaryKey val nim: Int,
    @ColumnInfo(name = "nama") val nama: String?,
    @ColumnInfo(name = "alamat") val prodi: String?
)
