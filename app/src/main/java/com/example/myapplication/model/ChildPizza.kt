package com.example.myapplication.model

import java.util.UUID
import java.io.Serializable

data class ChildPizza(
    override val id: String = UUID.randomUUID().toString(),
    override val title: String,
    override val description: String,
    override val image: Int,
    override val price: Int
): Serializable, Pizza(id,title, description, image, price)