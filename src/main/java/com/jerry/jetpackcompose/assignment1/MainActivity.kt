package com.jerry.jetpackcompose.assignment1

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import com.example.jetpackcomposeassignment1.Course
import com.example.jetpackcomposeassignment1.ui.theme.JetpackComposeAssignment1Theme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            JetpackComposeAssignment1Theme {
                var showWelcomeScreen by remember { mutableStateOf(true) }

                val courseList = listOf(
                    Course("Graphics", "CS301", 3, "Jetpack Compose", "OOP"),
                    Course("Applied Physics", "CS202", 3, "Trees, Graphs", "Intro to CS"),
                    Course("Electronics", "CS303", 4, "Processes, Memory", "DS"),
                    Course("Applied Mathematics", "CS305", 3, "HTML, CSS, JavaScript", "Intro to CS"),
                    Course("Kinematics", "CS304", 3, "SQL, ER Diagrams", "Data Structures"),
                    Course("Dynamics", "CS401", 3, "Search, Heuristics", "Data Structures"),
                    Course("Mechanics", "CS306", 3, "OSI Model, Protocols", "OS"),
                    Course("AI", "CS402", 4, "Supervised, Unsupervised", "AI"),
                    Course("Cyber Security", "CS403", 3, "Encryption, Network Security", "Networks"),
                    Course("Cloud Computing", "CS404", 3, "AWS, Azure, Virtualization", "OS"),
                    Course("Human-Computer Interaction", "CS307", 2, "UX, UI Principles", "Web Development")
                )

                if (showWelcomeScreen) {
                    WelcomeScreen(onContinueClicked = { showWelcomeScreen = false })
                } else {
                    CourseListScreen(
                        courses = courseList,
                        onBackClicked = { showWelcomeScreen = true }
                    )
                }

            }
        }
    }
}
