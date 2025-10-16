package br.com.fiap.recipes.factory

import br.com.fiap.recipes.service.CategoryService
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

/*
 Com object, garantimos que haverá apenas
 uma única instância do objeto de conexão
 */
//class RetrofitClient {
//
//    private val baseUrl = "http://10.0.2.2:8080/api/"
//
//    private val retrofitFactory = Retrofit
//        .Builder()
//        .baseUrl(baseUrl)
//        .addConverterFactory(GsonConverterFactory.create())
//        .build()
//
//    fun getCategoryService(): CategoryService{
//        return retrofitFactory.create(CategoryService::class.java)
//    }
//
//}

object RetrofitClient {

    private const val BASE_URL = "http://10.0.2.2:8080/api/"

    private val retrofit by lazy {
        Retrofit.Builder()
            .baseUrl(BASE_URL)
            .addConverterFactory(GsonConverterFactory.create())
            .build()
    }

    fun getCategoryService(): CategoryService {
        return retrofit.create(CategoryService::class.java);
    }

}