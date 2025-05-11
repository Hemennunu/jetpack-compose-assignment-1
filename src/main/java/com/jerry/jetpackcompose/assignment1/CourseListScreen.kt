package com.jerry.jetpackcompose.assignment1

import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.example.jetpackcomposeassignment1.Course
import com.jerry.jetpackcomposeassignment1.CourseCard

@Composable
fun CourseListScreen(
    courses: List<Course>,
    onBackClicked: () -> Unit
) {
    Column(modifier = Modifier.padding(16.dp)) {
        Button(onClick = onBackClicked) {
            Text("Back to Home")
        }

        Spacer(modifier = Modifier.height(16.dp))

        LazyColumn {
            items(courses) { course ->
                CourseCard(course = course)
            }
        }
    }
}
