package com.gmail.yunussimulya.core.model.repository

import com.gmail.yunussimulya.core.model.entity.Product
import kotlinx.coroutines.flow.Flow

interface ProductRepository {
    fun getAllProducts(): Flow<List<Product>>
    fun getProductById(id: Long): Flow<Product?>
    fun getProductByName(name: String): Flow<Product?>
    suspend fun insertProduct(product: Product)
    suspend fun updateProduct(product: Product)
    suspend fun deleteProduct(product: Product)
}