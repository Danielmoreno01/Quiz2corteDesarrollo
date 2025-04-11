package com.example.quiz.ui.theme

import androidx.compose.ui.graphics.Color

data class ColorBand(val name: String, val value: Int, val multiplier: Double = 1.0, val tolerance: String = "", val color: Color)

object ColorBandData {

    val bandColors = listOf(
        ColorBand("Negro", 0, color = Color.Black),
        ColorBand("Marrón", 1, color = Color(0xFF8B4513)),
        ColorBand("Rojo", 2, color = Color.Red),
        ColorBand("Naranja", 3, color = Color(0xFFFFA500)),
        ColorBand("Amarillo", 4, color = Color.Yellow),
        ColorBand("Verde", 5, color = Color.Green),
        ColorBand("Azul", 6, color = Color.Blue),
        ColorBand("Violeta", 7, color = Color(0xFF8A2BE2)),
        ColorBand("Gris", 8, color = Color.Gray),
        ColorBand("Blanco", 9, color = Color.White)
    )

    val multiplierColors = listOf(
        ColorBand("Negro", 0, multiplier = 1.0, color = Color.Black),
        ColorBand("Marrón", 1, multiplier = 10.0, color = Color(0xFF8B4513)),
        ColorBand("Rojo", 2, multiplier = 100.0, color = Color.Red),
        ColorBand("Naranja", 3, multiplier = 1000.0, color = Color(0xFFFFA500)),
        ColorBand("Amarillo", 4, multiplier = 10000.0, color = Color.Yellow)
    )

    val toleranceColors = listOf(
        ColorBand("Dorado", 0, tolerance = "±5%", color = Color(0xFFFFD700)),
        ColorBand("Plateado", 0, tolerance = "±10%", color = Color(0xFFC0C0C0)),
        ColorBand("Sin color", 0, tolerance = "±20%", color = Color.Transparent)
    )
}
