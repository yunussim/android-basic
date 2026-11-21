package com.gmail.yunussimulya.core.data.di

import android.content.Context
import androidx.room.Room
import com.gmail.yunussimulya.core.data.local.AppDatabase
import com.gmail.yunussimulya.core.data.local.dao.ProductDao
import com.gmail.yunussimulya.core.data.repository.ProductRepositoryImpl
import com.gmail.yunussimulya.core.model.repository.ProductRepository
import dagger.Binds
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.qualifiers.ApplicationContext
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
internal object DatabaseModule {

    @Provides
    @Singleton
    fun provideAppDatabase(
        @ApplicationContext context: Context
    ): AppDatabase = Room.databaseBuilder(
        context,
        AppDatabase::class.java,
        "app_database.db"
    ).build()

    @Provides
    fun provideProductDao(database: AppDatabase): ProductDao =
        database.productDao()
}

@Module
@InstallIn(SingletonComponent::class)
internal abstract class DataModule {

    @Binds
    @Singleton
    abstract fun bindProductRepository(
        impl: ProductRepositoryImpl
    ): ProductRepository
}