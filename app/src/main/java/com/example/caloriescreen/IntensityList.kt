package com.example.caloriescreen

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.DropdownMenu
import androidx.compose.material3.DropdownMenuItem
import androidx.compose.material3.Icon
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.compose.material3.icons.Icons
import androidx.compose.material3.icons.filled.ArrowDropDown
import androidx.compose.material3.icons.filled.ArrowDropUp
import androidx.compose.ui.tooling.preview.Preview

@Composable
fun IntensityList(selectedIntensity: String, onIntensityChange: (String) -> Unit, activityLevels: List<String>) {
    var isExpanded by remember { mutableStateOf(false) }

    Column(modifier = Modifier.fillMaxWidth().padding(16.dp)) {
        OutlinedTextField(
            value = selectedIntensity,
            onValueChange = {},
            modifier = Modifier.fillMaxWidth(),
            readOnly = true,
            trailingIcon = {
                Icon(
                    imageVector = if (isExpanded) Icons.Filled.ArrowDropUp else Icons.Filled.ArrowDropDown,
                    contentDescription = null,
                    modifier = Modifier.clickable { isExpanded = !isExpanded }
                )
            }
        )

        DropdownMenu(
            expanded = isExpanded,
            onDismissRequest = { isExpanded = false }
        ) {
            activityLevels.forEach { level ->
                DropdownMenuItem(
                    text = { Text(level) },
                    onClick = {
                        onIntensityChange(level)
                        isExpanded = false
                    }
                )
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
fun IntensityListPreview() {
    IntensityList(
        selectedIntensity = "Select Activity Level",
        onIntensityChange = {},
        activityLevels = listOf("Low", "Medium", "High")
    )
}
