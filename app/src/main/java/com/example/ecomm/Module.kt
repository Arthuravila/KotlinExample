package com.example.ecomm

import org.koin.dsl.module

val viewModelModule = module {
    single { ProductViewModel(ProductRepository()) }
}