package br.com.fiap.recipes.service

import br.com.fiap.recipes.model.Recipe
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Path

interface RecipeService {

    @GET("recipes/categories/{categoryId}")
    fun getRecipesByCategoryId(@Path("categoryId") categoryId: Int): Call<List<Recipe>>

}