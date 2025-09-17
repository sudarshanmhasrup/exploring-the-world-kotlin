//package com.trying.kotlin.coroutines
//
//import kotlinx.coroutines.CoroutineScope
//import kotlinx.coroutines.Dispatchers
//import kotlinx.coroutines.delay
//import kotlinx.coroutines.launch
//import kotlinx.coroutines.runBlocking
//
//suspend fun progressBar() {
//    for (i in 1..10) {
//        print(message = "#")
//        delay(1000)
//    }
//}
//
//fun main() {
//    val job = CoroutineScope(Dispatchers.IO).launch {
//        progressBar()
//    }
//
//    runBlocking {
//        job.join()
//    }
//}