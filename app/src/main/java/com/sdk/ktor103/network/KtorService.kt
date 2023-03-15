package com.sdk.ktor103.network

import com.sdk.ktor103.model.Product
import io.ktor.client.request.*

object KtorService {
    suspend fun getProduct(): Product {
        return KtorClient.httpClient.use {
            it.get("https://fakestoreapi.com/products/1")
        }
    }
}