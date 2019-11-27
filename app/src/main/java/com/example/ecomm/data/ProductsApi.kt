package com.example.ecomm.data

import com.example.ecomm.BuildConfig
import okhttp3.OkHttpClient
import okhttp3.logging.HttpLoggingInterceptor
import retrofit2.Retrofit
import retrofit2.converter.moshi.MoshiConverterFactory

object ProductsApi {

    private const val BASE_URL = "https://api.pokemontcg.io/v1/"

    private val httpClient = OkHttpClient.Builder().apply {
        if (BuildConfig.DEBUG) {
            addInterceptor(provideLoggingInterceptor())
        }
    }

    private fun provideLoggingInterceptor(): HttpLoggingInterceptor {
        return HttpLoggingInterceptor().apply {
            level = HttpLoggingInterceptor.Level.BODY

        }
    }

    private val retrofitBuilder: Retrofit.Builder by lazy {
        Retrofit.Builder()
            .baseUrl(BASE_URL)
            .addConverterFactory(MoshiConverterFactory.create())
            .client(httpClient.build())
    }

    val apiService: APIService by lazy {
        retrofitBuilder
            .build()
            .create(APIService::class.java)
    }

}