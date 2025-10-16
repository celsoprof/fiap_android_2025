package br.com.fiap.recipes.repository

import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import br.com.fiap.recipes.factory.RetrofitClient
import br.com.fiap.recipes.model.Category
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

@Composable
fun getAllCategories(): List<Category>{

    var categories by remember {
        mutableStateOf(listOf<Category>())
    }

    // Variável que armazena a instância de um objeto Call
    var callCategories = RetrofitClient.getCategoryService().getAllCategories()

    // Executar requisição para o endpoid
    callCategories.enqueue(object: Callback<List<Category>>{

        override fun onResponse(
            call: Call<List<Category>?>,
            response: Response<List<Category>?>
        ) {
            categories = response.body()!!
        }

        override fun onFailure(
            p0: Call<List<Category>?>,
            p1: Throwable
        ) {
            println("Erro: ${p1.printStackTrace()}")
        }

    })

    return categories
}

@Composable
fun getCategoryById(id: Int) = getAllCategories()
    .find { category ->
        category.id == id
    }