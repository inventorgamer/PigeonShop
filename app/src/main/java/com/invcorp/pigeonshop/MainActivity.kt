package com.invcorp.pigeonshop

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.RecyclerView.LayoutManager
import com.invcorp.pigeonshop.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        val adapter = ShopProductsListAdapter()
        adapter.addProductElement(ShopProductElement("Ананас Сатурн", 122, R.drawable.ananas))
        adapter.addProductElement(ShopProductElement("Арбуз Лакомыч", 202, R.drawable.arbuz))
        adapter.addProductElement(ShopProductElement("Яблоки Громыч-Паво", 35, R.drawable.apples))
        adapter.addProductElement(ShopProductElement("Ананас Сатурн", 434, R.drawable.ananas))
        adapter.addProductElement(ShopProductElement("Арбуз Лакомыч", 133, R.drawable.arbuz))
        adapter.addProductElement(ShopProductElement("Яблоки Громыч-Паво", 23, R.drawable.apples))
        binding.rvShopList.adapter = adapter
        binding.rvShopList.layoutManager = GridLayoutManager(this,2)


    }

    private fun sandMessage(textPrint : String){
        Toast.makeText(this, textPrint, Toast.LENGTH_LONG).show()
    }

}