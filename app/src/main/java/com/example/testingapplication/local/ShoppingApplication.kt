package com.example.testingapplication.local

import android.app.Application


class ShoppingApplication :Application() {

    private val database by lazy {
        ShoppingItemDatabase.getDatabase(this@ShoppingApplication)
    }

    val repository by lazy {
        database.shoppingDao()
    }
}