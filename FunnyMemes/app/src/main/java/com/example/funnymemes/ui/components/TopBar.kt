package com.example.funnymemes.ui.components

import androidx.compose.material.Text
import androidx.compose.material.TopAppBar
import androidx.compose.runtime.Composable

@Composable
fun TopBar(title: String) {
    TopAppBar {
        Text(text = title)
    }
}