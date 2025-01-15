package com.example.bearbearsrestaurant.ui.component

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.statusBarsPadding
import androidx.compose.foundation.layout.width
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.automirrored.rounded.ArrowBack
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.bearbearsrestaurant.ui.theme.BearBlack
import com.example.bearbearsrestaurant.ui.theme.BearBrown50
import com.example.bearbearsrestaurant.ui.theme.bearBodyTypeFace

@Composable
fun BearsTopBar(
    modifier: Modifier = Modifier
) {
    Row(
        verticalAlignment = Alignment.CenterVertically,
        modifier = modifier
            .statusBarsPadding()
            .fillMaxWidth()
            .background(BearBrown50)
            .height(56.dp)
    ) {
        Spacer(Modifier.width(8.dp))
        IconButton(
            onClick = {},
            modifier = Modifier
        ) {
            Icon(Icons.AutoMirrored.Rounded.ArrowBack, contentDescription = "back button")
        }
        Spacer(Modifier.width(8.dp))
        Column {
            Spacer(Modifier.height(4.dp))
            Text(
                text = "Choose main dish",
                fontFamily = bearBodyTypeFace,
                fontWeight = FontWeight.Bold,
                fontSize = 32.sp,
                lineHeight = 32.sp,
                letterSpacing = 0.sp,
                color = BearBlack
            )
        }
    }
}
