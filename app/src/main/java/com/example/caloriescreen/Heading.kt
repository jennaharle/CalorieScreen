package com.example.caloriescreen

import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.sp

@Composable
fun Heading(title: String) {
    Text(
        text = title,
        fontSize = 24.sp,
        textAlign = TextAlign.Center,
        modifier = androidx.compose.ui.Modifier.fillMaxWidth()
    )
}

@Preview(showBackground = true)
@Composable
fun HeadingPreview() {
    Heading("Calorie Tracker")
}
