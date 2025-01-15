package com.example.bearbearsrestaurant

import BearsBottomBar
import android.content.Intent
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.compose.runtime.internal.composableLambda
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.tooling.preview.Preview
import androidx.lifecycle.viewmodel.compose.viewModel
import androidx.navigation.NavController
import androidx.navigation.NavHost
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.currentBackStackEntryAsState
import androidx.navigation.compose.rememberNavController
import com.example.bearbearsrestaurant.data.DataSource
import com.example.bearbearsrestaurant.data.OrderUiState
import com.example.bearbearsrestaurant.ui.component.BearsTopBar
import com.example.bearbearsrestaurant.ui.screen.DishSelectionScreen
import com.example.bearbearsrestaurant.ui.screen.HomeScreen
import com.example.bearbearsrestaurant.ui.screen.OrderSummary
import com.example.bearbearsrestaurant.ui.theme.BearBearsRestaurantTheme
import com.example.bearbearsrestaurant.ui.viewmodel.DishType
import com.example.bearbearsrestaurant.ui.viewmodel.OrderViewModel

enum class BearScreen(val title: String) {
    Home("Home"),
    MainDishSelection("Choose main dish"),
    SideDishSelection("Choose side dish"),
    DrinkSelection("Choose your drink"),
    OrderSummary("Order Summary")
}

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
fun App(
    navController: NavHostController = rememberNavController(),
    orderViewModel: OrderViewModel = viewModel()
) {
    val orderUiState by orderViewModel.uiState.collectAsState()

    val navBackStackEntry by navController.currentBackStackEntryAsState()
    val isInHome = navBackStackEntry?.destination?.route == BearScreen.Home.name
    val routeTitle = BearScreen.valueOf(navBackStackEntry?.destination?.route ?: BearScreen.Home.name).title
    val isInSummary = navBackStackEntry?.destination?.route == BearScreen.OrderSummary.name

    val context = LocalContext.current
    fun sendOrderToIcedBear() {
        val orderSummary = "${orderUiState.mainDish?.name}, ${orderUiState.sideDish?.name} and ${orderUiState.drink?.name}"
        val intent = Intent().apply {
            action = Intent.ACTION_SEND
            putExtra(Intent.EXTRA_TEXT, orderSummary)
            type = "text/plain"
        }
        val shareIntent = Intent.createChooser(intent, "Hi Iced Bear :), this is my order")
        context.startActivity(shareIntent)
    }

    Scaffold(
        topBar = {
            BearsTopBar(
                isVisible = !isInHome,
                routeTitle = routeTitle,
                onBackButtonPressed = { navController.navigateUp() },
            )
        },
        bottomBar = {
            BearsBottomBar(
                isVisible = !isInHome,
                isInSummary = isInSummary,
                onCancelPressed = {
                    navController.popBackStack(BearScreen.Home.name, false)
                    orderViewModel.resetOrder()
                },
                onNextPressed = {
                    when (navBackStackEntry?.destination?.route) {
                        BearScreen.MainDishSelection.name -> {
                            navController.navigate(BearScreen.SideDishSelection.name)
                        }
                        BearScreen.SideDishSelection.name -> {
                            navController.navigate(BearScreen.DrinkSelection.name)
                        }
                        BearScreen.DrinkSelection.name -> {
                            navController.navigate(BearScreen.OrderSummary.name)
                        }
                        BearScreen.OrderSummary.name -> {
                            sendOrderToIcedBear()
                        }
                    }
                }
            )
        },
        modifier = Modifier.fillMaxSize()
    ) { innerPadding ->
        NavHost(
            navController = navController,
            startDestination = BearScreen.Home.name,
            modifier = Modifier.padding(innerPadding)
        ) {
            composable(BearScreen.Home.name) {
                HomeScreen(
                    onStartOrderingPressed = {
                        navController.navigate(BearScreen.MainDishSelection.name)
                    }
                )
            }
            composable(BearScreen.MainDishSelection.name) {
                DishSelectionScreen(
                    options = DataSource.mainDishes,
                    onSelectionChanged = {
                        orderViewModel.selectDish(it, DishType.Main)
                    }
                )
            }
            composable(BearScreen.SideDishSelection.name) {
                DishSelectionScreen(
                    options = DataSource.sideDishes,
                    onSelectionChanged = {
                        orderViewModel.selectDish(it, DishType.Side)
                    }
                )
            }
            composable(BearScreen.DrinkSelection.name) {
                DishSelectionScreen(
                    options = DataSource.drinks,
                    onSelectionChanged = {
                        orderViewModel.selectDish(it, DishType.Drink)
                    }
                )
            }
            composable(BearScreen.OrderSummary.name) {
                OrderSummary(
                    orderUiState = orderUiState,
                )
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    BearBearsRestaurantTheme {
        App()
    }
}