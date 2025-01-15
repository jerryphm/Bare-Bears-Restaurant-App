package com.example.bearbearsrestaurant.ui.screen

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.HorizontalDivider
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.SpanStyle
import androidx.compose.ui.text.buildAnnotatedString
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.withStyle
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.bearbearsrestaurant.data.OrderUiState
import com.example.bearbearsrestaurant.ui.theme.BearBlack
import com.example.bearbearsrestaurant.ui.theme.bearBodyTypeFace

@Composable
fun OrderSummary(
    orderUiState: OrderUiState,
    modifier: Modifier = Modifier
) {
    Column(
        modifier = modifier
            .padding(20.dp)
            .fillMaxSize()
    ) {
        Text(
            text = buildAnnotatedString {
                append("Main Dish: ")
                withStyle(style = SpanStyle(fontWeight = FontWeight.ExtraBold)) {
                    append(orderUiState.mainDish?.name ?: "Grilled chicken")
                }
                append(" (${orderUiState.mainDish?.price.toString()}$)")
            },
            fontFamily = bearBodyTypeFace,
            fontWeight = FontWeight.Normal,
            fontSize = 20.sp,
            lineHeight = 28.sp,
            letterSpacing = 0.sp,
            color = BearBlack
        )
        Text(
            text = buildAnnotatedString {
                append("Side Dish: ")
                withStyle(style = SpanStyle(fontWeight = FontWeight.ExtraBold)) {
                    append(orderUiState.sideDish?.name ?: "Grilled chicken")
                }
                append(" (${orderUiState.sideDish?.price.toString()}$)")
            },
            fontFamily = bearBodyTypeFace,
            fontWeight = FontWeight.Normal,
            fontSize = 20.sp,
            lineHeight = 28.sp,
            letterSpacing = 0.sp,
            color = BearBlack
        )
        Text(
            text = buildAnnotatedString {
                append("Drink: ")
                withStyle(style = SpanStyle(fontWeight = FontWeight.ExtraBold)) {
                    append(orderUiState.drink?.name)
                }
                append(" (${orderUiState.drink?.price.toString()}$)")
            },
            fontFamily = bearBodyTypeFace,
            fontWeight = FontWeight.Normal,
            fontSize = 20.sp,
            lineHeight = 28.sp,
            letterSpacing = 0.sp,
            color = BearBlack
        )
        HorizontalDivider(
            thickness = 0.75.dp,
            color = BearBlack,
            modifier = Modifier
                .fillMaxWidth()
                .padding(top = 24.dp, bottom = 26.dp)
        )
        Text(
            text = buildAnnotatedString {
                append("Total: ")
                withStyle(style = SpanStyle(fontWeight = FontWeight.ExtraBold)) {
                    append("${orderUiState.total}$")
                }
            },
            fontFamily = bearBodyTypeFace,
            fontWeight = FontWeight.Normal,
            fontSize = 20.sp,
            lineHeight = 28.sp,
            letterSpacing = 0.sp,
            color = BearBlack
        )
        Spacer(Modifier.height(8.dp))
        Text(
            text = "(included ${orderUiState.total - orderUiState.subTotal}$ tax)",
            fontFamily = bearBodyTypeFace,
            fontWeight = FontWeight.Normal,
            fontSize = 16.sp,
            lineHeight = 22.sp,
            letterSpacing = 0.sp,
            color = BearBlack
        )
    }
}