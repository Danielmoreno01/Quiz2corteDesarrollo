package com.example.quiz.ui.theme

fun calculateResistance(
    band1: ColorBand,
    band2: ColorBand,
    multiplier: ColorBand,
    tolerance: ColorBand
): String {
    val value = ((band1.value * 10) + band2.value) * multiplier.multiplier
    return "$value Ω ${tolerance.tolerance}"
}
