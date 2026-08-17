package com.example.myapplication.screens.contact

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import com.example.myapplication.screens.contact.components.ContactTopBar

@Composable
fun ContactScreen() {
    Column(
        modifier = Modifier.fillMaxSize()
    ) {
        ContactTopBar()
    }
}