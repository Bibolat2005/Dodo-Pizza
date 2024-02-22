package com.example.myapplication
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.myapplication.MainActivity
import com.example.myapplication.databinding.ActivitySecondBinding
import android.view.View



import com.example.myapplication.model.Pizza

class SecondActivity: AppCompatActivity(){

    private lateinit var binding: ActivitySecondBinding
    override fun onCreate(savedInstanceState: Bundle?){
        super.onCreate(savedInstanceState)
        binding = ActivitySecondBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val pizza = intent.extras?.getSerializable("Dodo pizza") as Pizza

            binding.image.setImageResource(pizza.image)
            binding.title.text = "${pizza.title}"
            binding.description.text = pizza.description
            binding.button.text="В корзину за " + pizza.price.toString() + " KZT"

    }
    fun goBack(view: View) {    finish()
    }
}