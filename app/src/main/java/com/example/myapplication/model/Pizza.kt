package com.example.myapplication.model
import java.util.UUID
import java.io.Serializable
data class Pizza(
    val id: String = UUID.randomUUID().toString(),
    val title: String,
    val description: String,
    val image: Int,
    val price: Int
): Serializable