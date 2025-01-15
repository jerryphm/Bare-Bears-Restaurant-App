package com.example.bearbearsrestaurant

import BearsBottomBar
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.bearbearsrestaurant.data.DataSource
import com.example.bearbearsrestaurant.data.OrderUiState
import com.example.bearbearsrestaurant.ui.component.BearsTopBar
import com.example.bearbearsrestaurant.ui.screen.DishSelectionScreen
import com.example.bearbearsrestaurant.ui.screen.OrderSummary
import com.example.bearbearsrestaurant.ui.theme.BearBearsRestaurantTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            BearBearsRestaurantTheme {
                App()
            }
        }
    }
}

@Composable
fun App() {
    Scaffold(
        topBar = { BearsTopBar() },
        bottomBar = { BearsBottomBar() },
        modifier = Modifier.fillMaxSize()
    ) { innerPadding ->
//        HomeScreen(modifier = Modifier.padding(innerPadding))
//        DishSelectionScreen(
//            options = DataSource.mainDishes,
//            modifier = Modifier.padding(innerPadding)
//        )
//        DishSelectionScreen(
//            options = DataSource.sideDishes,
//            modifier = Modifier.padding(innerPadding)
//        )
//        DishSelectionScreen(
//            options = DataSource.drinks,
//            modifier = Modifier.padding(innerPadding)
//        )
        OrderSummary(
            orderUiState = OrderUiState(),
            modifier = Modifier.padding(innerPadding)
        )
    }
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    BearBearsRestaurantTheme {
        App()
    }
}