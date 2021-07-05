package com.kanayo.persistence

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.kanayo.persistence.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    private lateinit var myshopadapter: ShoppingAdapter
    private lateinit var myShoppingList: MutableList<ShoppingModel>

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        myShoppingList = mutableListOf()

        myshopadapter = ShoppingAdapter(listOf())
        binding.recyclerView2.adapter

        binding.button.setOnClickListener {
            val category : String = binding.editText.text.toString()
            val description : String = binding.editText2.text.toString()

            val shoppingItem = ShoppingModel(category, description)
            myShoppingList.add(shoppingItem)
            myshopadapter.notifyDataSetChanged()
        }
    }
}