package br.com.fiap.recipes.navigation

import kotlinx.serialization.Serializable

@Serializable
object InitialScreenRoute

@Serializable
object LoginScreenRoute

@Serializable
object SignupScreenRoute

@Serializable
data class HomeScreenRoute(val email: String)