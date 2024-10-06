package com.example.caloriescreen

import androidx.compose.foundation.layout.*
import androidx.compose.material3.Text
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

@Composable
fun CalorieScreen() {
    // Painon tilamuuttuja
    val (weight, setWeight) = remember { mutableStateOf("") }

    // Sukupuolen tilamuuttuja (true = mies, false = nainen)
    val (isMale, setIsMale) = remember { mutableStateOf(true) }

    // Aktiviteettitason tilamuuttuja
    val (selectedIntensity, setSelectedIntensity) = remember { mutableStateOf("Select Activity Level") }

    // Taulukko näytettävistä aktiviteettitasoista
    val activityLevels = listOf("Low", "Medium", "High")

    // Tuloksen tilamuuttuja
    val (result, setResult) = remember { mutableStateOf(0) }

    Column(
        modifier = Modifier.fillMaxSize().padding(16.dp)
    ) {
        Heading(title = "Calorie Tracker")

        // Painokenttä
        WeightField(weight = weight, onWeightChange = setWeight)

        // Sukupuolen valinta
        GenderChoices(isMaleSelected = isMale, onGenderSelected = setIsMale)

        // Aktiviteettitason valinta
        IntensityList(selectedIntensity = selectedIntensity, onIntensityChange = setSelectedIntensity, activityLevels = activityLevels)

        // Laskentakenttä
        Calculation(
            weight = weight.toIntOrNull() ?: 0,
            intensity = when (selectedIntensity) {
                "Low" -> 1.2
                "Medium" -> 1.55
                "High" -> 1.9
                else -> 1.0
            },
            isMale = isMale,
            onResultUpdate = setResult
        )

        // Näytetään tulos
        Text(text = "Calories Consumed: $result", modifier = Modifier.padding(top = 16.dp))
    }
}
