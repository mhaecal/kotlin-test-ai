package com.example.myapplication.navigation

import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.Notifications
import androidx.compose.material.icons.filled.Person
import androidx.compose.material.icons.filled.Search
import androidx.compose.ui.graphics.vector.ImageVector

sealed class Screen(
    val route: String,
    val title: String,
    val icon: ImageVector
) {
    data object Home : Screen("home", "Home", Icons.Default.Home)
    data object Search : Screen("search", "Search", Icons.Default.Search)
    data object Notifications : Screen("notifications", "Notifications", Icons.Default.Notifications)
    data object Profile : Screen("profile", "Profile", Icons.Default.Person)

    companion object {
        val bottomBarItems = listOf(Home, Search, Notifications, Profile)
    }
}