package br.com.fiap.recipes.repository

import androidx.compose.ui.graphics.Color
import br.com.fiap.recipes.R
import br.com.fiap.recipes.model.Category

fun getAllCategories() = listOf<Category>(
    Category(id = 1, name = "Chicken",
        image = R.drawable.cooking, background = Color(0xFFABF2E9)),
    Category(id = 2, name = "Beef",
        image = null, background = Color(0xFFF4D6C0)),
    Category(id = 3, name = "Fish",
        image = null, background = Color(0xFFC6DAFA)),
    Category(id = 4, name = "Bakery",
        image = null, background = Color(0xFFF8D9D9)),
    Category(id = 5, name = "Vegetable",
        image = null, background = Color(0xFFABF2E9)),
    Category(id = 6, name = "Desserts",
        image = null, background = Color(0xFF72412B)),
    Category(id = 7, name = "Drinks",
        image = null, background = Color(0xFF80DEEA))
)