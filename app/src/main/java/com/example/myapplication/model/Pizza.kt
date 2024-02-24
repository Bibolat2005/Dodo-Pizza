package com.example.myapplication.model
import java.util.UUID
import java.io.Serializable
open class Pizza(
    open val id: String = UUID.randomUUID().toString(),
    open val title: String,
    open val description: String,
    open val image: Int,
    open val price: Int,
    open val check: Boolean
): Serializable