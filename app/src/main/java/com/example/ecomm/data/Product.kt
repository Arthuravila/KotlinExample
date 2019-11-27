package com.example.ecomm.data

import com.squareup.moshi.Json

data class Product(
    @field:Json(name = "name") val name: String? = null,
    @field:Json(name = "totalCards") val price: Int? = null,
    @field:Json(name = "logoUrl") val logoUrl: String? = null
)


