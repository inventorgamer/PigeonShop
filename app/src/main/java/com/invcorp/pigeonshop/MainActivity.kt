package com.invcorp.pigeonshop

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

import androidx.recyclerview.widget.GridLayoutManager
import com.invcorp.pigeonshop.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        val adapter = ShopProductsListAdapter()
        adapter.addProductElement(ShopProductElement("Ананас", 251, R.drawable.ananas))
        adapter.addProductElement(ShopProductElement("Арбуз", 202, R.drawable.arbuz))
        adapter.addProductElement(ShopProductElement("Яблоки", 32, R.drawable.apples))
        adapter.addProductElement(ShopProductElement("Ананас", 430, R.drawable.ananas))
        adapter.addProductElement(ShopProductElement("Арбуз", 133, R.drawable.arbuz))
        adapter.addProductElement(ShopProductElement("Яблоки", 22, R.drawable.apples))
        binding.rvShopList.adapter = adapter
        binding.rvShopList.layoutManager = GridLayoutManager(this,2)


    }

}