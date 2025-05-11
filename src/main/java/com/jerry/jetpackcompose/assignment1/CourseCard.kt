package com.jerry.jetpackcomposeassignment1

import androidx.compose.animation.animateContentSize
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.jetpackcomposeassignment1.Course

@Composable
fun CourseCard(course: Course) {
    var isExpanded by rememberSaveable { mutableStateOf(false) }

    Card(
        modifier = Modifier
            .padding(8.dp)
            .fillMaxWidth()
            .clickable { isExpanded = !isExpanded },
        colors = CardDefaults.cardColors(
            containerColor = MaterialTheme.colorScheme.surface
        ),
        elevation = CardDefaults.cardElevation(4.dp)
    ) {
        Column(
            modifier = Modifier
                .padding(16.dp)
                .animateContentSize()
        ) {
            Text(text = course.title, style = MaterialTheme.typography.titleLarge)
            Spacer(modifier = Modifier.height(4.dp))
            Row {
                Text(text = "Code: ${course.code}", style = MaterialTheme.typography.bodyMedium)
                Spacer(modifier = Modifier.width(16.dp))
                Text(text = "Credits: ${course.creditHours}", style = MaterialTheme.typography.bodyMedium)
            }
            if (isExpanded) {
                Spacer(modifier = Modifier.height(8.dp))
                Text(text = "Description: ${course.description}", style = MaterialTheme.typography.bodyMedium)
                Spacer(modifier = Modifier.height(4.dp))
                Text(text = "Prerequisites: ${course.prerequisites}", style = MaterialTheme.typography.bodyMedium)
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
fun PreviewCourseCard() {
    val sample = Course(
        title = "Mobile App Development",
        code = "CS301",
        creditHours = 3,
        description = "Covers Android development using Jetpack Compose.",
        prerequisites = "OOP, Java Basics"
    )
    CourseCard(course = sample)
}
