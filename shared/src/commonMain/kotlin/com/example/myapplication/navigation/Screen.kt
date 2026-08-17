package com.example.myapplication.navigation

import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.outlined.AccessTime
import androidx.compose.material.icons.outlined.AccountCircle
import androidx.compose.material.icons.outlined.Call
import androidx.compose.material.icons.outlined.StarOutline
import androidx.compose.ui.graphics.vector.ImageVector

sealed class Screen(
    val route: String,
    val title: String,
    val icon: ImageVector
) {
    data object Favorite : Screen("favorite", "Favorites", Icons.Outlined.StarOutline)
    data object Recent : Screen("recent", "Recent", Icons.Outlined.AccessTime)
    data object Contact : Screen("contact", "Contact", Icons.Outlined.AccountCircle)
    data object Call : Screen("call", "Call", Icons.Outlined.Call)

    companion object {
        val bottomBarItems = listOf(Favorite, Recent, Contact, Call)
    }
}