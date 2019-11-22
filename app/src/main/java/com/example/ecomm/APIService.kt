package com.example.ecomm

import retrofit2.Response
import retrofit2.http.*

interface APIService {
    @Headers("Content-Type: application/json", "Accept: application/json")
    @GET("sets")
    suspend fun getDataAsync(): Response<ProductSets>
}