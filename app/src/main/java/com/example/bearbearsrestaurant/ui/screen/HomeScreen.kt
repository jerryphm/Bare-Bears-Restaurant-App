package com.example.bearbearsrestaurant.ui.screen

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.ButtonColors
import androidx.compose.material3.Text
import androidx.compose.material3.TextButton
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.bearbearsrestaurant.R
import com.example.bearbearsrestaurant.ui.theme.BearBrown
import com.example.bearbearsrestaurant.ui.theme.BearBrown50
import com.example.bearbearsrestaurant.ui.theme.BearWhite
import com.example.bearbearsrestaurant.ui.theme.bearBodyTypeFace
import com.example.bearbearsrestaurant.ui.theme.bearDisplayTypeFace

@Composable
fun HomeScreen(modifier: Modifier = Modifier) {
    Column(
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center,
        modifier = modifier
            .fillMaxSize()
    ) {
        Text(
            text = "Welcome to the\nBare Bears' Restaurant",
            fontFamily = bearDisplayTypeFace,
            fontSize = 32.sp,
            lineHeight = 35.2.sp,
            letterSpacing = 0.sp,
            textAlign = TextAlign.Center,
            color = BearBrown
        )
        Spacer(Modifier.height(32.dp))
        Image(
            painter = painterResource(R.drawable.bears),
            contentDescription = "Bears",
            modifier = Modifier.fillMaxWidth(0.8f)
        )
        Spacer(Modifier.height(96.dp))
        TextButton(
            onClick = {},
            shape = RoundedCornerShape(12.dp),
            contentPadding = PaddingValues(
                horizontal = 16.dp,
                vertical = 12.dp
            ),
            colors = ButtonColors(
                containerColor = BearBrown,
                contentColor = BearWhite,
                disabledContainerColor = BearBrown50,
                disabledContentColor = BearWhite
            )
        ) {
            Text(
                text = "Start Ordering!",
                fontFamily = bearBodyTypeFace,
                fontSize = 24.sp,
                lineHeight = 36.sp,
                letterSpacing = 0.sp,
                textAlign = TextAlign.Center,
                fontWeight = FontWeight.Normal
            )
        }
    }
}