package com.example.ecomm

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import kotlinx.coroutines.launch

class ProductViewModel(
    private val productRepo: ProductRepository
) : ViewModel() {

    val productLiveData: MutableLiveData<List<Product>> = MutableLiveData()

    init {
        fetchData()
    }

    private fun fetchData() {
        viewModelScope.launch {
            val lista = productRepo.getData()
            productLiveData.value = lista?.sets
        }
    }

}