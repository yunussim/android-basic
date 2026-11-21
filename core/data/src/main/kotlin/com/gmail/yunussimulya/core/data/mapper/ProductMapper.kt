package com.gmail.yunussimulya.core.data.mapper

import com.gmail.yunussimulya.core.data.backup.ProductBackupDto
import com.gmail.yunussimulya.core.data.entity.ProductEntity
import com.gmail.yunussimulya.core.model.entity.Product

internal fun ProductEntity.toModel(): Product = Product(
    id = id,
    name = name,
    basePrice = basePrice,
    wholesalePrice = wholesalePrice,
    retailPrice = retailPrice,
    timeInput = timeInput
)

internal fun Product.toEntity(): ProductEntity = ProductEntity(
    id = id,
    name = name,
    basePrice = basePrice,
    wholesalePrice = wholesalePrice,
    retailPrice = retailPrice,
    timeInput = timeInput
)

internal fun ProductEntity.toBackup(): ProductBackupDto = ProductBackupDto(
    id = id,
    name = name,
    basePrice = basePrice,
    wholesalePrice = wholesalePrice,
    retailPrice = retailPrice,
    timeInput = timeInput
)

internal fun ProductBackupDto.toEntity(): ProductEntity = ProductEntity(
    id = id,
    name = name,
    basePrice = basePrice,
    wholesalePrice = wholesalePrice,
    retailPrice = retailPrice,
    timeInput = timeInput
)