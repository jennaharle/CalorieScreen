package com.example.caloriescreen

import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material3.OutlinedTextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.tooling.preview.Preview

@Composable
fun WeightField(weight: String, onWeightChange: (String) -> Unit) {
    OutlinedTextField(
        value = weight,
        onValueChange = onWeightChange,
        label = { androidx.compose.material3.Text("Weight (kg)") },
        keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Number)
    )
}

@Preview(showBackground = true)
@Composable
fun WeightFieldPreview() {
    WeightField(weight = "", onWeightChange = {})
}
