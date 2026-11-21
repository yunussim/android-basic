package com.gmail.yunussimulya.core.data.backup

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
internal data class ProductBackupDto(
    @SerialName("id")
    val id: Long = 0,
    @SerialName("name")
    val name: String,
    @SerialName("base_price")
    val basePrice: Long,
    @SerialName("wholesale_price")
    val wholesalePrice: Long,
    @SerialName("retail_price")
    val retailPrice: Long,
    @SerialName("time_input")
    val timeInput: Long
)
