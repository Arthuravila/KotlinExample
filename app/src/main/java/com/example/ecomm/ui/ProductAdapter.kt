package com.example.ecomm.ui

import androidx.recyclerview.widget.RecyclerView
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import com.example.ecomm.data.Product
import com.example.ecomm.R
import com.example.ecomm.databinding.ProductRowItemBinding

class ProductAdapter(
    private val products: List<Product>
) : RecyclerView.Adapter<ProductAdapter.ProductViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int) =
        ProductViewHolder(
            DataBindingUtil.inflate(
                LayoutInflater.from(parent.context),
                R.layout.product_row_item,
                parent,
                false
            )
        )

    override fun getItemCount(): Int = products.size

    override fun onBindViewHolder(viewHolder: ProductViewHolder, position: Int) {
        viewHolder.recyclerViewProductBinding.product = products[position]
    }


    inner class ProductViewHolder(
       val recyclerViewProductBinding: ProductRowItemBinding
    ) : RecyclerView.ViewHolder(recyclerViewProductBinding.root)

}