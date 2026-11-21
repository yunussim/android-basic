package com.gmail.yunussimulya.core.model.entity

data class Product(
    val id: Long = 0,
    val name: String,
    val basePrice: Long,
    val wholesalePrice: Long,
    val retailPrice: Long,
    val timeInput: Long
)