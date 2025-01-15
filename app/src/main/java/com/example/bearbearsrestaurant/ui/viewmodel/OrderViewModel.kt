package com.example.bearbearsrestaurant.ui.viewmodel

import androidx.lifecycle.ViewModel
import com.example.bearbearsrestaurant.data.Dish
import com.example.bearbearsrestaurant.data.OrderUiState
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.flow.update

enum class DishType {
    Main,
    Side,
    Drink
}

const val TAX_RATE = 0.08

class OrderViewModel: ViewModel() {
    private val _uiState: MutableStateFlow<OrderUiState> = MutableStateFlow(OrderUiState())
    val uiState: StateFlow<OrderUiState> = _uiState.asStateFlow()

    fun selectDish(dish: Dish, type: DishType) {
        _uiState.update {
            when (type) {
                DishType.Main -> it.copy(mainDish = dish)
                DishType.Side -> it.copy(sideDish = dish)
                DishType.Drink -> it.copy(drink = dish)
            }
        }

        _uiState.update {
            val subTotal = (it.mainDish?.price ?: 0.0) + (it.sideDish?.price ?: 0.0) + (it.drink?.price ?: 0.0)
            val total = subTotal + subTotal * TAX_RATE
            it.copy(
                subTotal = subTotal,
                total = total
            )
        }
    }

    fun resetOrder() {
        _uiState.value = OrderUiState()
    }
}