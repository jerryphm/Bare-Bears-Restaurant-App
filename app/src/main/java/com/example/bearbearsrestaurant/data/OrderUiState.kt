package com.example.bearbearsrestaurant.data

data class OrderUiState(
    val mainDish: Dish? = null,
    val sideDish: Dish? = null,
    val drink: Dish? = null,
    val subTotal: Double = 0.0,
    val total: Double = 0.0
)
