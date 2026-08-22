package com.example.myapplication.theme

import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Typography
import androidx.compose.runtime.Composable
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import myapplication.shared.generated.resources.Poppins_Bold
import myapplication.shared.generated.resources.Poppins_Regular
import myapplication.shared.generated.resources.Poppins_SemiBold
import myapplication.shared.generated.resources.Res
import org.jetbrains.compose.resources.Font

@Composable
fun AppTheme(
    content: @Composable () -> Unit
) {
    val poppins = FontFamily(
        Font(
            Res.font.Poppins_Regular,
            FontWeight.Normal
        ),
        Font(
            Res.font.Poppins_SemiBold,
            FontWeight.SemiBold
        ),
        Font(
            Res.font.Poppins_Bold,
            FontWeight.Bold
        )
    )

    MaterialTheme(
        typography = Typography(
            bodyLarge = TextStyle(fontFamily = poppins),
            bodyMedium = TextStyle(fontFamily = poppins),
            bodySmall = TextStyle(fontFamily = poppins),
            titleLarge = TextStyle(fontFamily = poppins),
            titleMedium = TextStyle(fontFamily = poppins),
            titleSmall = TextStyle(fontFamily = poppins),
            headlineLarge = TextStyle(fontFamily = poppins),
            headlineMedium = TextStyle(fontFamily = poppins),
            headlineSmall = TextStyle(fontFamily = poppins),
            labelLarge = TextStyle(fontFamily = poppins),
            labelMedium = TextStyle(fontFamily = poppins),
            labelSmall = TextStyle(fontFamily = poppins)
        ),
        content = content
    )
}