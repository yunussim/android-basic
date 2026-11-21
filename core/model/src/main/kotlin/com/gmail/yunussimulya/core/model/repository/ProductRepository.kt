package com.gmail.yunussimulya.core.model.repository

import com.gmail.yunussimulya.core.model.entity.Product
import kotlinx.coroutines.flow.Flow

interface ProductRepository {
    fun getAllProducts(): Flow<List<Product>>
    fun getProductByName(name: String): Flow<Product?>
    suspend fun saveProduct(product: Product)
    suspend fun deleteProduct(product: Product)
}