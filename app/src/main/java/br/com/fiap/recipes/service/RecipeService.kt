package br.com.fiap.recipes.service

import br.com.fiap.recipes.model.Recipe
import br.com.fiap.recipes.model.RecipeRequest
import retrofit2.Call
import retrofit2.http.Body
import retrofit2.http.GET
import retrofit2.http.POST
import retrofit2.http.Path

interface RecipeService {

    @GET("recipes/categories/{categoryId}")
    fun getRecipesByCategoryId(@Path("categoryId") categoryId: Int): Call<List<Recipe>>

    @GET("recipes/recents")
    fun getLatestRecipes(): Call<List<Recipe>>

    @POST("recipes")
    suspend fun saveRecipe(@Body recipeRequest: RecipeRequest): RecipeRequest
    //fun saveRecipe(@Body recipeRequest: RecipeRequest): Call<RecipeRequest>

}