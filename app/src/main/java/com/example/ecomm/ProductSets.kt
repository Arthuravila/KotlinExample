package com.example.ecomm

import com.squareup.moshi.Json

data class ProductSets(
    @field:Json(name = "sets") val sets: List<Product>
)