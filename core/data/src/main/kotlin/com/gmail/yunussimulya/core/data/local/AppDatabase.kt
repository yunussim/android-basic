package com.gmail.yunussimulya.core.data.local

import androidx.room.Database
import androidx.room.RoomDatabase
import com.gmail.yunussimulya.core.data.entity.ProductEntity
import com.gmail.yunussimulya.core.data.local.dao.ProductDao

@Database(
    entities = [ProductEntity::class],
    version = 1,
    exportSchema = true
)
internal abstract class AppDatabase : RoomDatabase() {
    abstract fun productDao(): ProductDao
}