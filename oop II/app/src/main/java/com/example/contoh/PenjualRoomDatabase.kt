package com.example.contoh

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase

@Database(entities = arrayOf(Penjual::class), version = 1)
abstract class PenjualRoomDatabase : RoomDatabase() {
    abstract fun penjualDao(): PenjualDao

    abstract val applicationContext: Context
    val db = Room.databaseBuilder(
        applicationContext,
        PenjualRoomDatabase::class.java, "dbsemarsusu"
    ).build()

}