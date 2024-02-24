package com.example.myapplication.model

import java.util.UUID
import java.io.Serializable
data class Combo(
    override val id: String = UUID.randomUUID().toString(),
    override val title: String,
    override val description: String,
    override val image: Int,
    override val price: Int,
    override val check:Boolean
): Serializable, Pizza(id, title, description, image, price,check)
