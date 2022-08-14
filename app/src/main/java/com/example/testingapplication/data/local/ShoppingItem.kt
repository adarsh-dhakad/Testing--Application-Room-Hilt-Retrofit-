package com.example.testingapplication.data.local

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "shopping_items")
data class ShoppingItem(
    @ColumnInfo var name: String,
    @ColumnInfo var amount: Int,
    @ColumnInfo var price: Float,
    @ColumnInfo var imageUrl: String,
    @PrimaryKey(autoGenerate = true)
    val id: Int = 0
)