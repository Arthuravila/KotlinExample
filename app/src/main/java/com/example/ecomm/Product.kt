package com.example.ecomm

import com.squareup.moshi.Json

data class Product(
    @field:Json(name = "name") val name: String? = null,
    @field:Json(name = "totalCards") val totalCards: Int? = null,
    @field:Json(name = "logoUrl") val logoUrl: String? = null
)


