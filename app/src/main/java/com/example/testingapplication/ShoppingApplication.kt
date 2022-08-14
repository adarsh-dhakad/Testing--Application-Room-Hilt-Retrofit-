package com.example.testingapplication

import android.app.Application
import com.example.testingapplication.data.local.ShoppingItemDatabase
import dagger.hilt.android.HiltAndroidApp


@HiltAndroidApp
class ShoppingApplication :Application() {

    private val database by lazy {
        ShoppingItemDatabase.getDatabase(this@ShoppingApplication)
    }

    val repository by lazy {
        database.shoppingDao()
    }
}