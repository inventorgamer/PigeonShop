package com.invcorp.pigeonshop

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.invcorp.pigeonshop.databinding.PurchasesItemLayoutBinding

class ShopProductsListAdapter() : RecyclerView.Adapter<ShopProductsListAdapter.ShopProductsListHolder>() {

    private var productList = ArrayList<ShopProductElement>()

    class ShopProductsListHolder(itemView: View) : RecyclerView.ViewHolder(itemView){
        private var purchasesListBinding = PurchasesItemLayoutBinding.bind(itemView)
        fun purchasesBind(productItem : ShopProductElement){
            purchasesListBinding.tvPriceKopecks.text = "00 ₽"
            purchasesListBinding.tvPriceRubles.text = productItem.price.toString()
            purchasesListBinding.tvName.text = productItem.name
            purchasesListBinding.ivPurchasePhoto.setImageResource(productItem.imageId)

        }

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ShopProductsListHolder {
        var productView = LayoutInflater.from(parent.context).inflate(R.layout.purchases_item_layout,parent,false)
        return  ShopProductsListHolder(productView)
    }

    override fun getItemCount(): Int {
        return productList.size
    }

    override fun onBindViewHolder(holder: ShopProductsListHolder, position: Int) {
        holder.purchasesBind(productList[position])
    }
    public fun addProductElement(element : ShopProductElement){
        productList.add(element)
        notifyDataSetChanged()
    }


}