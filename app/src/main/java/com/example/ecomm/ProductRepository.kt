package com.example.ecomm

import retrofit2.Response


class ProductRepository {

    suspend fun getData(): ProductSets? {
        val response: Response<ProductSets> = RetrofitClient.apiService.getDataAsync()
        if (response.isSuccessful) return response.body()
        return null
    }
}