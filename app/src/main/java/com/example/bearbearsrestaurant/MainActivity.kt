package com.example.bearbearsrestaurant

import BearsBottomBar
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.navigationBarsPadding
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.ButtonColors
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TextButton
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.bearbearsrestaurant.ui.component.BearsTopBar
import com.example.bearbearsrestaurant.ui.screen.HomeScreen
import com.example.bearbearsrestaurant.ui.screen.MainDishSelectionScreen
import com.example.bearbearsrestaurant.ui.theme.BearBearsRestaurantTheme
import com.example.bearbearsrestaurant.ui.theme.BearBlack
import com.example.bearbearsrestaurant.ui.theme.BearBrown
import com.example.bearbearsrestaurant.ui.theme.BearWhite
import com.example.bearbearsrestaurant.ui.theme.bearBodyTypeFace

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
        MainDishSelectionScreen(modifier = Modifier.padding(innerPadding))
    }
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    BearBearsRestaurantTheme {
        App()
    }
}