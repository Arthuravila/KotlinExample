package com.example.ecomm.ui

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.ecomm.data.Product
import com.example.ecomm.data.ProductRepository
import kotlinx.coroutines.launch

class ProductViewModel(
    private val productRepo: ProductRepository
) : ViewModel() {

    private val _productLiveData = MutableLiveData<List<Product>>()
    val productLiveData: LiveData<List<Product>>
        get() = _productLiveData


    init {
        fetchData()
    }

    private fun fetchData() {
        viewModelScope.launch {
            val lista = productRepo.getData()
            _productLiveData.value = lista?.sets
        }
    }

}