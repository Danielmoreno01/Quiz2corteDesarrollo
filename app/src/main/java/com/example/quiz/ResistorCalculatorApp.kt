package com.example.quiz.ui.theme

import androidx.compose.foundation.layout.*
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import androidx.compose.material3.*

@Composable
fun ResistorCalculatorApp() {
    val band1Options = ColorBandData.bandColors
    val band2Options = ColorBandData.bandColors
    val multiplierOptions = ColorBandData.multiplierColors
    val toleranceOptions = ColorBandData.toleranceColors

    var selectedBand1 by remember { mutableStateOf(band1Options[0]) }
    var selectedBand2 by remember { mutableStateOf(band2Options[0]) }
    var selectedMultiplier by remember { mutableStateOf(multiplierOptions[0]) }
    var selectedTolerance by remember { mutableStateOf(toleranceOptions[0]) }

    Column(modifier = Modifier.padding(16.dp)) {
        DropdownBand("Banda 1", band1Options, selectedBand1) { selectedBand1 = it }
        DropdownBand("Banda 2", band2Options, selectedBand2) { selectedBand2 = it }
        DropdownBand("Multiplicador", multiplierOptions, selectedMultiplier) { selectedMultiplier = it }
        DropdownBand("Tolerancia", toleranceOptions, selectedTolerance) { selectedTolerance = it }

        Spacer(modifier = Modifier.height(24.dp))

        ResistorVisual(
            band1Color = selectedBand1.color,
            band2Color = selectedBand2.color,
            multiplierColor = selectedMultiplier.color,
            toleranceColor = selectedTolerance.color
        )

        Spacer(modifier = Modifier.height(24.dp))

        val result = calculateResistance(selectedBand1, selectedBand2, selectedMultiplier, selectedTolerance)
        Text(text = "Resistencia: $result", style = MaterialTheme.typography.titleMedium)
    }
}
