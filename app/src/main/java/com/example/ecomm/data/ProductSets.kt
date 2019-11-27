package com.example.ecomm.data

import com.example.ecomm.data.Product
import com.squareup.moshi.Json

data class ProductSets(
    @field:Json(name = "sets") val sets: List<Product>
)