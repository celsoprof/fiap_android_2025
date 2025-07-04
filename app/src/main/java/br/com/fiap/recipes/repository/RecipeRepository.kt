package br.com.fiap.recipes.repository

import br.com.fiap.recipes.R
import br.com.fiap.recipes.model.Category
import br.com.fiap.recipes.model.DifficultLevel
import br.com.fiap.recipes.model.Recipe
import br.com.fiap.recipes.model.User
import java.time.LocalDate

fun getAllRecipes() = listOf<Recipe>(
    Recipe(
        id = 1,
        category = Category(id = 1000, name = "Desserts"),
        user = User(id = 100, name = "Ana Maria"),
        difficultLevel = DifficultLevel.BEGINNER,
        name = "Bolo de Cenoura",
        cookingTime = 60,
        createdAt = LocalDate.now(),
        image = R.drawable.bolo_cenoura
    ),
    Recipe(
        id = 2,
        category = Category(id = 2000, name = "Vegetables"),
        user = User(id = 200, name = "Pedro Augusto"),
        difficultLevel = DifficultLevel.INTERMEDIATE,
        name = "Salada de Palmito",
        cookingTime = 10,
        createdAt = LocalDate.now(),
        image = R.drawable.salada_de_palmito
    ),
    Recipe(
        id = 3,
        category = Category(id = 3000, name = "Bakery"),
        user = User(id = 200, name = "Patricia Oliveira"),
        difficultLevel = DifficultLevel.ADVANCED,
        name = "Pão de calabresa",
        cookingTime = 10,
        createdAt = LocalDate.now(),
        image = R.drawable.pao_calabresa
    )
)