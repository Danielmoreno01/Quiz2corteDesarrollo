package com.example.quiz.ui.theme

import androidx.compose.foundation.layout.*
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

@Composable
fun DropdownBand(
    label: String,
    options: List<ColorBand>,
    selectedOption: ColorBand,
    onSelectionChange: (ColorBand) -> Unit
) {
    var expanded by remember { mutableStateOf(false) }

    Column(modifier = Modifier.fillMaxWidth().padding(vertical = 4.dp)) {
        Text(text = label, style = MaterialTheme.typography.labelLarge)

        Box {
            Button(onClick = { expanded = true }) {
                Text(selectedOption.name)
            }

            DropdownMenu(expanded = expanded, onDismissRequest = { expanded = false }) {
                options.forEach { colorBand ->
                    DropdownMenuItem(
                        text = { Text(colorBand.name) },
                        onClick = {
                            onSelectionChange(colorBand)
                            expanded = false
                        }
                    )
                }
            }
        }
    }
}
