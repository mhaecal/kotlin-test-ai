package com.example.myapplication.screens.profile.components

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.unit.dp

@Composable
fun ProfileImage(
    imagePainter: Painter,
    modifier: Modifier = Modifier
) {
    Image(
        painter = imagePainter,
        contentDescription = "Circle Image",
        modifier = modifier
            .size(80.dp)
            .clip(CircleShape)
    )
}