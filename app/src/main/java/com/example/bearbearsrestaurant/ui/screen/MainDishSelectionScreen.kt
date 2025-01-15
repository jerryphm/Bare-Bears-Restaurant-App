package com.example.bearbearsrestaurant.ui.screen

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.selection.selectable
import androidx.compose.foundation.selection.selectableGroup
import androidx.compose.material3.RadioButton
import androidx.compose.material3.RadioButtonColors
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.bearbearsrestaurant.data.DataSource
import com.example.bearbearsrestaurant.data.Dish
import com.example.bearbearsrestaurant.ui.theme.BearBlack
import com.example.bearbearsrestaurant.ui.theme.bearBodyTypeFace

@Composable
fun MainDishSelectionScreen(modifier: Modifier = Modifier) {
    var selectedDish: Dish? by rememberSaveable { mutableStateOf(null) }

    Column(
        modifier = modifier
            .padding(20.dp)
            .fillMaxSize()
            .selectableGroup()
    ) {
        DataSource.mainDishes.forEach {
            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .selectable(
                        selected = selectedDish?.name == it.name,
                        onClick = { selectedDish = it }
                    )
            ) {
                RadioButton(
                    selected = selectedDish?.name == it.name,
                    onClick = { selectedDish = it},
                    colors = RadioButtonColors(
                        selectedColor = BearBlack,
                        unselectedColor = BearBlack,
                        disabledSelectedColor = BearBlack,
                        disabledUnselectedColor = BearBlack
                    )
                )
                Column {
                    Spacer(modifier = Modifier.height(10.dp))
                    Text(
                        text = it.name,
                        fontFamily = bearBodyTypeFace,
                        fontWeight = FontWeight.ExtraBold,
                        fontSize = 20.sp,
                        lineHeight = 28.sp,
                        letterSpacing = 0.sp,
                        color = BearBlack
                    )
                    Text(
                        text = it.description,
                        fontFamily = bearBodyTypeFace,
                        fontWeight = FontWeight.Normal,
                        fontSize = 16.sp,
                        lineHeight = 24.sp,
                        letterSpacing = 0.sp,
                        color = BearBlack
                    )
                }
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
fun MainDishSelectionScreenPreview() {
    MainDishSelectionScreen()
}