package com.example.caloriescreen

//import androidx.benchmark.perfetto.Row
import androidx.compose.foundation.layout.Row
import androidx.compose.material3.RadioButton
//import androidx.compose.material3.Row
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember


@Composable
fun GenderChoices(isMaleSelected: Boolean, onGenderSelected: (Boolean) -> Unit) {
    Row {
        RadioButton(
            selected = isMaleSelected,
            onClick = { onGenderSelected(true) }
        )
        Text("Male")

        RadioButton(
            selected = !isMaleSelected,
            onClick = { onGenderSelected(false) }
        )
        Text("Female")
    }
}
