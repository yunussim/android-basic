package com.gmail.yunussimulya.core.data.entity

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "products")
internal data class ProductEntity(
    @ColumnInfo("id")
    @PrimaryKey(autoGenerate = true) val id: Long = 0,
    @ColumnInfo("name")
    val name: String,
    @ColumnInfo("base_price")
    val basePrice: Long,
    @ColumnInfo("wholesale_price")
    val wholesalePrice: Long,
    @ColumnInfo("retail_price")
    val retailPrice: Long,
    @ColumnInfo("time_input")
    val timeInput: Long
)
