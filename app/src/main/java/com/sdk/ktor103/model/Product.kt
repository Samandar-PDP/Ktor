package com.sdk.ktor103.model

@kotlinx.serialization.Serializable
data class Product(
    val id: Int,
    val title: String,
    val price: Double,
    val image: String
)