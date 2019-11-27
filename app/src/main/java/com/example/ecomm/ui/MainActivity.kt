package com.example.ecomm.ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.lifecycle.Observer
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.ecomm.R
import kotlinx.android.synthetic.main.activity_main.*
import org.koin.androidx.viewmodel.ext.android.viewModel

class MainActivity : AppCompatActivity() {

    private val productViewModel: ProductViewModel by viewModel()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        toolbarMain.title = getString(R.string.lista)
        setSupportActionBar(toolbarMain)

        productViewModel.productLiveData.observe(this, Observer {
            it?.let { products ->
                with(products_recyclerview) {
                    layoutManager = LinearLayoutManager(this@MainActivity, RecyclerView.VERTICAL, false)
                    setHasFixedSize(true)
                    adapter = ProductAdapter(products)
                }
            }
        })

    }


}
