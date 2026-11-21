package com.gmail.yunussimulya.core.data.entity

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity
data class ProductEntity(
    @PrimaryKey(autoGenerate = true) val id: Long = 0,
    val name: String,
    val basePrice: Long,
    val wholesalePrice: Long,
    val retailPrice: Long,
    val timeInput: Long
)
