package br.com.fiap.recipes.repository

import android.content.Context
import android.widget.Toast
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import br.com.fiap.recipes.factory.RetrofitClient
import br.com.fiap.recipes.model.Category
import br.com.fiap.recipes.model.DifficultLevel
import br.com.fiap.recipes.model.Recipe
import br.com.fiap.recipes.model.RecipeRequest
import br.com.fiap.recipes.model.User
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response
import java.time.LocalDate

@Composable
fun getLatestRecipes(): List<Recipe>{
    var latestRecipes by remember {
        mutableStateOf(listOf<Recipe>())
    }

    val callLatestRecipes = RetrofitClient.getRecipeSercive().getLatestRecipes()

    callLatestRecipes.enqueue(object : Callback<List<Recipe>>{
        override fun onResponse(
            p0: Call<List<Recipe>?>,
            response: Response<List<Recipe>?>
        ) {
            latestRecipes = response.body() ?: emptyList()
        }

        override fun onFailure(
            p0: Call<List<Recipe>?>,
            p1: Throwable
        ) {
            println(p1.message)
        }

    })
    return latestRecipes
}

//@Composable
 suspend fun saveRecipe(recipeRequest: RecipeRequest): RecipeRequest {

    //var newRecipe: RecipeRequest? = RecipeRequest()

    val newRecipe = RetrofitClient.getRecipeSercive().saveRecipe(recipeRequest)

//    callNewRecipe.enqueue(object : Callback<RecipeRequest>{
//        override fun onResponse(
//            p0: Call<RecipeRequest?>,
//            response: Response<RecipeRequest?>
//        ) {
//            println(response.body())
//            newRecipe = response.body()
//        }
//
//        override fun onFailure(
//            p0: Call<RecipeRequest?>,
//            p1: Throwable
//        ) {
//            println(p1.message)
//        }
//    })
    return newRecipe!!
}

fun getAllRecipes() = listOf<Recipe>(
    Recipe(
        id = 1,
        category = Category(id = 6000, name = "Desserts"),
        user = User(id = 100, name = "Ana Maria"),
        difficultLevel = DifficultLevel.BEGINNER,
        name = "Bolo de Cenoura",
        description = "Moist, spiced, carrot-filled cake with tangy cream cheese frosting.",
        cookingTime = 60,
        createdAt = LocalDate.now(),
        image = "/images/bolo_de_cenoura.jpg"
    ),
    Recipe(
        id = 2,
        category = Category(id = 5000, name = "Vegetables"),
        user = User(id = 200, name = "Pedro Augusto"),
        difficultLevel = DifficultLevel.INTERMEDIATE,
        name = "Salada de Palmito",
        description = "Refreshing heart of palm salad, light, savory, and subtly sweet.",
        cookingTime = 10,
        createdAt = LocalDate.now(),
        image = "/images/salada_de_palmito.png"
    ),
    Recipe(
        id = 3,
        category = Category(id = 4000, name = "Bakery"),
        user = User(id = 300, name = "Patricia Oliveira"),
        difficultLevel = DifficultLevel.ADVANCED,
        name = "Pão de calabresa",
        description = "Spicy sausage and cheese bread: soft, savory, delicious.",
        cookingTime = 10,
        createdAt = LocalDate.now(),
        image = "/images/pao_calabresa.jpeg"
    ),
    Recipe(
        id = 4,
        category = Category(id = 5000, name = "Vegetables"),
        user = User(id = 400, name = "Mariana Dias"),
        difficultLevel = DifficultLevel.ADVANCED,
        name = "Sopa de Legumes",
        description = "Hearty vegetable soup: warm, nourishing, fresh, wholesome goodness.",
        cookingTime = 45,
        createdAt = LocalDate.now(),
        image = "/images/sopa_legumes.jpg"
    ),
    Recipe(
        id = 5,
        category = Category(id = 2000, name = "Beef"),
        user = User(id = 500, name = "Carlos Almeida"),
        difficultLevel = DifficultLevel.ADVANCED,
        name = "Feijoada",
        description = "Rich, smoky, hearty, bean and meat stew.",
        cookingTime = 120,
        createdAt = LocalDate.now(),
        image = "/images/feijoada.jpg"
    )
)

@Composable
fun getRecipesByCategory(id: Int): List<Recipe> {
    var recipes by remember {
        mutableStateOf(listOf<Recipe>())
    }

    println("-----> $id")
    val callRecipesByCategory = RetrofitClient.getRecipeSercive().getRecipesByCategoryId(id)

    callRecipesByCategory.enqueue(object : Callback<List<Recipe>>{
        override fun onResponse(
            p0: Call<List<Recipe>?>,
            response: Response<List<Recipe>?>
        ) {
            recipes = response.body() ?: emptyList()
        }

        override fun onFailure(
            p0: Call<List<Recipe>?>,
            p1: Throwable
        ) {
            println(p1.message)
        }

    })
    return recipes
}

fun getRecipeById(id: Int) = getAllRecipes()
    .filter {
        it.id == id
    }





















