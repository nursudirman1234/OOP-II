package com.example.contoh

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "penjual")
data class Penjual(
    @PrimaryKey val nim: Int,
    @ColumnInfo(name = "nama") val nama: String?,
    @ColumnInfo(name = "produk") val prodi: String?
)