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
        category = Category(id = 6000, name = "Desserts"),
        user = User(id = 100, name = "Ana Maria"),
        difficultLevel = DifficultLevel.BEGINNER,
        name = "Bolo de Cenoura",
        cookingTime = 60,
        createdAt = LocalDate.now(),
        image = R.drawable.bolo_cenoura
    ),
    Recipe(
        id = 2,
        category = Category(id = 5000, name = "Vegetables"),
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
        user = User(id = 300, name = "Patricia Oliveira"),
        difficultLevel = DifficultLevel.ADVANCED,
        name = "Pão de calabresa",
        cookingTime = 10,
        createdAt = LocalDate.now(),
        image = R.drawable.pao_calabresa
    ),
    Recipe(
        id = 4,
        category = Category(id = 5000, name = "Vegetables"),
        user = User(id = 400, name = "Mariana Dias"),
        difficultLevel = DifficultLevel.ADVANCED,
        name = "Sopa de Legumes",
        cookingTime = 45,
        createdAt = LocalDate.now(),
        image = R.drawable.sopa_legumes
    ),
    Recipe(
        id = 5,
        category = Category(id = 2000, name = "Beef"),
        user = User(id = 500, name = "Carlos Almeida"),
        difficultLevel = DifficultLevel.ADVANCED,
        name = "Feijoada",
        cookingTime = 120,
        createdAt = LocalDate.now(),
        image = R.drawable.feijoada
    )
)

fun getRecipeById(id: Int) = getAllRecipes()
    .filter {
        it.id == id
    }

fun getRecipeByCategory(id: Int) = getAllRecipes()
    .filter {
        it.category.id == id
    }

fun main() {
    val id = 1;
    var recipe = getAllRecipes().filter {
        it.id == id
    }
    println(recipe)
    println("________RECIPE POR ID____________")
    println(getRecipeById(2))
    println("________RECIPES POR CATEGORIA____________")
    println(getRecipeByCategory(2000))
}




















