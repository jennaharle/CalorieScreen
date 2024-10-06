package com.example.caloriescreen

import androidx.compose.runtime.Composable

@Composable
fun Calculation(weight: Int, intensity: Double, isMale: Boolean, onResultUpdate: (Int) -> Unit) {
    val baseCalories = if (isMale) {
        weight * 13.75 // Esimerkki kalorilaskentakaava miehille
    } else {
        weight * 9.56 // Esimerkki kalorilaskentakaava naisille
    }

    val totalCalories = (baseCalories * intensity).toInt()

    // Päivitetään tulos
    onResultUpdate(totalCalories)
}