package com.example.myapplication.components

import androidx.compose.material3.Icon
import androidx.compose.material3.NavigationBar
import androidx.compose.material3.NavigationBarItem
import androidx.compose.material3.NavigationBarItemDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color
import androidx.navigation.NavDestination
import androidx.navigation.NavDestination.Companion.hierarchy
import com.example.myapplication.navigation.Screen

@Composable
fun AppNavigationBar(
    currentDestination: NavDestination?,
    onNavigateToScreen: (Screen) -> Unit
) {
    NavigationBar {
        Screen.bottomBarItems.forEach { screen ->
            val isSelected = currentDestination?.hierarchy?.any { it.route == screen.route } == true

            NavigationBarItem(
                selected = isSelected,
                onClick = { onNavigateToScreen(screen) },
                icon = {
                    Icon(
                        imageVector = screen.icon,
                        contentDescription = screen.title
                    )
                },
                label = { Text(text = screen.title) },
                colors = NavigationBarItemDefaults.colors(
                    selectedIconColor = Color(0xFF134ede),
                    selectedTextColor = Color(0xFF134ede),
                    unselectedIconColor = Color.Gray,
                    unselectedTextColor = Color.Gray,
                    indicatorColor = Color.Transparent
                )
            )
        }
    }
}