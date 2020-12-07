package com.example.contoh

import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.Query

@Dao
interface PenjualDao {
    @Query("SELECT * FROM penjual")
    fun getAll(): List<Penjual>

    @Query("SELECT * FROM penjual WHERE nama IN (:userIds)")
    fun loadAllByIds(userIds: IntArray): List<Penjual>

    @Query("SELECT * FROM penjual WHERE nama LIKE :nama AND " +
            "prodi LIKE :produk LIMIT 1")
    fun findByName(nama: String, prodi: String): Penjual

    @Insert
    fun insertAll(vararg penjual: Penjual)

    @Delete
    fun delete(penjual: Penjual)
}