package com.example.ecomm.data

class ProductRepository(
    private val api: ProductsApi
) : SafeApiRequest() {

    suspend fun getData() = apiRequest { api.apiService.getDataAsync()}

}