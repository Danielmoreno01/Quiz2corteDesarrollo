package com.example.quiz.ui.theme

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp

@Composable
fun ResistorVisual(
    band1Color: Color,
    band2Color: Color,
    multiplierColor: Color,
    toleranceColor: Color
) {
    Column(
        modifier = Modifier
            .fillMaxWidth()
            .padding(top = 32.dp),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        // Cuerpo de la resistencia
        Box(
            modifier = Modifier
                .width(200.dp)
                .height(50.dp)
                .background(Color.LightGray, RoundedCornerShape(8.dp))
        ) {
            // Bandas de color
            Row(
                modifier = Modifier
                    .fillMaxSize()
                    .padding(horizontal = 16.dp),
                verticalAlignment = Alignment.CenterVertically,
                horizontalArrangement = Arrangement.SpaceBetween
            ) {
                Band(band1Color)
                Band(band2Color)
                Band(multiplierColor)
                Band(toleranceColor)
            }
        }
    }
}

@Composable
fun Band(color: Color) {
    Box(
        modifier = Modifier
            .width(15.dp)
            .height(40.dp)
            .background(color = color, shape = RoundedCornerShape(4.dp))
    )
}
