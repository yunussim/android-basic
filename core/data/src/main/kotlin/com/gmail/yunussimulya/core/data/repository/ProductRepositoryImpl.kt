package com.gmail.yunussimulya.core.data.repository

import com.gmail.yunussimulya.core.data.local.dao.ProductDao
import com.gmail.yunussimulya.core.data.mapper.toEntity
import com.gmail.yunussimulya.core.model.entity.Product
import com.gmail.yunussimulya.core.model.repository.ProductRepository
import kotlinx.coroutines.flow.Flow

internal class ProductRepositoryImpl constructor(
    private val productDao: ProductDao
) : ProductRepository {

    override fun getAllProducts(): Flow<List<Product>> {
        TODO("Dao get all product")
    }

    override fun getProductByName(name: String): Flow<Product?> {
        TODO("Dao get product by name")
    }

    override suspend fun saveProduct(product: Product) {
        productDao.saveProduct(product.toEntity())
    }

    override suspend fun deleteProduct(product: Product) {
        TODO("Dao delete product")
    }
}