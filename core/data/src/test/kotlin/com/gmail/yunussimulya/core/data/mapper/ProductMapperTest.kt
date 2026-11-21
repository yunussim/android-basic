package com.gmail.yunussimulya.core.data.mapper

import com.gmail.yunussimulya.core.data.backup.ProductBackupDto
import com.gmail.yunussimulya.core.data.entity.ProductEntity
import com.gmail.yunussimulya.core.model.entity.Product
import org.junit.Assert.assertEquals
import org.junit.Test

class ProductMapperTest {

    @Test
    fun `ProductEntity maps to Product with all fields`() {
        val entity = ProductEntity(
            id = 17L,
            name = "Coffee",
            basePrice = 10_000L,
            wholesalePrice = 12_000L,
            retailPrice = 15_000L,
            timeInput = 1_700_000_000L
        )

        val result = entity.toModel()

        assertEquals(
            Product(
                id = 17L,
                name = "Coffee",
                basePrice = 10_000L,
                wholesalePrice = 12_000L,
                retailPrice = 15_000L,
                timeInput = 1_700_000_000L
            ),
            result
        )
    }

    @Test
    fun `Product maps to ProductEntity with all fields`() {
        val product = Product(
            id = 23L,
            name = "Tea",
            basePrice = 5_000L,
            wholesalePrice = 6_000L,
            retailPrice = 8_000L,
            timeInput = 1_700_000_100L
        )

        val result = product.toEntity()

        assertEquals(
            ProductEntity(
                id = 23L,
                name = "Tea",
                basePrice = 5_000L,
                wholesalePrice = 6_000L,
                retailPrice = 8_000L,
                timeInput = 1_700_000_100L
            ),
            result
        )
    }

    @Test
    fun `ProductEntity maps to ProductBackupDto with all fields`() {
        val entity = ProductEntity(
            id = 31L,
            name = "Milk",
            basePrice = 7_000L,
            wholesalePrice = 8_000L,
            retailPrice = 10_000L,
            timeInput = 1_700_000_200L
        )

        val result = entity.toBackup()

        assertEquals(
            ProductBackupDto(
                id = 31L,
                name = "Milk",
                basePrice = 7_000L,
                wholesalePrice = 8_000L,
                retailPrice = 10_000L,
                timeInput = 1_700_000_200L
            ),
            result
        )
    }

    @Test
    fun `ProductBackupDto maps to ProductEntity with all fields`() {
        val dto = ProductBackupDto(
            id = 42L,
            name = "Bread",
            basePrice = 3_000L,
            wholesalePrice = 4_000L,
            retailPrice = 5_000L,
            timeInput = 1_700_000_300L
        )

        val result = dto.toEntity()

        assertEquals(
            ProductEntity(
                id = 42L,
                name = "Bread",
                basePrice = 3_000L,
                wholesalePrice = 4_000L,
                retailPrice = 5_000L,
                timeInput = 1_700_000_300L
            ),
            result
        )
    }
}
