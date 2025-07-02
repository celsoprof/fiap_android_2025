package br.com.fiap.recipes.model

import androidx.annotation.DrawableRes
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.painter.Painter
import br.com.fiap.recipes.R

data class Category(
    val id: Int = 0,
    val name: String = "",
    @DrawableRes val image: Int? = R.drawable.cooking,
    val background: Color = Color.Gray
)
