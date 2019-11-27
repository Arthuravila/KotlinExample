package com.example.ecomm.util

import com.example.ecomm.data.ProductRepository
import com.example.ecomm.data.ProductsApi
import com.example.ecomm.ui.ProductViewModel
import org.koin.core.module.Module
import org.koin.dsl.module

val viewModelModule: Module = module {
    single { ProductViewModel(get()) }
}

val repositoryModule: Module = module {
    single { ProductRepository(get()) }
}

val networkModule: Module = module {
    single { ProductsApi }
}