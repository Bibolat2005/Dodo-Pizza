package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.content.Intent
import android.widget.Toast
import com.example.myapplication.databinding.ActivityMainBinding
import com.example.myapplication.model.Pizza
import com.example.myapplication.model.DataSource
import android.os.Bundle
import android.widget.Button
import com.example.myapplication.adapter.PizzaAdapter

class MainActivity : AppCompatActivity() {

    private lateinit var binding:ActivityMainBinding
    private lateinit var adapter: PizzaAdapter
    private lateinit var searchButton: Button
    private var PizzaList: List<Pizza> = DataSource.PizzaList

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        searchButton = binding.Button


        adapter()
        handleSearch()

    }

    private fun adapter() {
        adapter = PizzaAdapter { pizza ->
            handlePizzaClick(pizza)
        }
        adapter.setData(PizzaList)
        binding.recyclerView.adapter = adapter

    }

    private fun handleSearch() {
        binding.Button.setOnClickListener {
            filterList()
        }
    }


    private fun filterList() {
        val query = binding.editText.text.toString().trim()
        if (query.isNotEmpty()) {
            val filteredList = PizzaList.filter { it.title.lowercase().contains(query.lowercase()) }
            if (filteredList.isEmpty()) {
                Toast.makeText(this, "Ничего не найдено!", Toast.LENGTH_SHORT).show()
            }
            adapter.setData(ArrayList(filteredList))
        }
        else {
            adapter.setData(PizzaList)
        }
    }

    private fun handlePizzaClick(pizza: Pizza) {
        val intent = Intent(this, SecondActivity::class.java)
        intent.putExtra("Dodo pizza", pizza)
        startActivity(intent)
    }
}