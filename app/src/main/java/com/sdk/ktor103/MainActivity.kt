package com.sdk.ktor103

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.sdk.ktor103.network.KtorService
import kotlinx.coroutines.*

class MainActivity : AppCompatActivity() {
    @OptIn(DelicateCoroutinesApi::class)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        GlobalScope.launch(Dispatchers.IO) {
            val product = KtorService.getProduct()
            Log.d("Main", "onCreate: $product")
        }
    }
}