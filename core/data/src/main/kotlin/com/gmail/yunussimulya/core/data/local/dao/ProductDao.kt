package com.gmail.yunussimulya.core.data.local.dao

import androidx.room.Dao
import androidx.room.Upsert
import com.gmail.yunussimulya.core.data.entity.ProductEntity

@Dao
internal interface ProductDao {

    @Upsert
    suspend fun saveProduct(productEntity: ProductEntity): Long

}