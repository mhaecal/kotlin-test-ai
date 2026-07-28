package com.example.myapplication.navigation

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.example.myapplication.screens.HomeScreen
import com.example.myapplication.screens.NotificationScreen
import com.example.myapplication.screens.ProfileScreen
import com.example.myapplication.screens.SearchScreen

@Composable
fun AppNavHost(
    navController: NavHostController,
    modifier: Modifier = Modifier
) {
    NavHost(
        navController = navController,
        startDestination = Screen.Home.route,
        modifier = modifier
    ) {
        composable(Screen.Home.route) { HomeScreen() }
        composable(Screen.Search.route) { SearchScreen() }
        composable(Screen.Notifications.route) { NotificationScreen() }
        composable(Screen.Profile.route) { ProfileScreen() }
    }
}