package com.jerry.jetpackcompose.assignment1

import androidx.compose.foundation.layout.*
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun WelcomeScreen(onContinueClicked: () -> Unit) {
    Surface(modifier = Modifier.fillMaxSize()) {
        Column(
            modifier = Modifier.fillMaxSize(),
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Text(
                text = "Lab 1 Exercise",
                fontSize = 20.sp
            )
            Spacer(modifier = Modifier.height(24.dp))
            Button(onClick = onContinueClicked) {
                Text("Continue")
            }
        }
    }
}
