package com.example.myapplication.navigation

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.example.myapplication.screens.CallScreen
import com.example.myapplication.screens.ContactScreen
import com.example.myapplication.screens.FavoriteScreen
import com.example.myapplication.screens.RecentScreen

@Composable
fun AppNavHost(
    navController: NavHostController,
    modifier: Modifier = Modifier
) {
    NavHost(
        navController = navController,
        startDestination = Screen.Contact.route,
        modifier = modifier
    ) {
        composable(Screen.Favorite.route) { FavoriteScreen() }
        composable(Screen.Recent.route) { RecentScreen() }
        composable(Screen.Contact.route) { ContactScreen() }
        composable(Screen.Call.route) { CallScreen() }
    }
}