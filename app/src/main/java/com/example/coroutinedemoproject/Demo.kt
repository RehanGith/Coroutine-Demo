package com.example.coroutinedemoproject

import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.launch


suspend fun main() {

    val job = GlobalScope.launch {
        "Rehan"
    }
    job.join()
    println("coroutine finished")
}


