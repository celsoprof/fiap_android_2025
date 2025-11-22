package br.com.fiap.recipes.navigation

sealed class Destination(val route: String) {
    object InitialScreen : Destination("initial")
    object SignupScreen : Destination("signup")

    //object ProfileScreen: Destination("profile")
    object ProfileScreen : Destination("profile/{email}") {
        fun createRoute(email: String): String {
            return "profile/$email"
        }
    }

    object HomeScreen : Destination("home/{email}") {
        fun createRoute(email: String): String {
            return "home/$email"
        }
    }

    object LoginScreen : Destination("login")
    object AddRecipeScreen : Destination("addRecipeSreen")

    object CategoryRecipeScreen : Destination(
        route = "categoryRecipes/{id}"
    ) {
        fun createRoute(id: Int): String {
            return "categoryRecipes/$id"
        }
    }

    // Rota para a tela de cadastro de ingredientes da receita
    // passando o id e nome da receita como argumentos da rota
    object AddRecipeIngredientsScreen : Destination(
        route = "addIngredients/{recipeId}/{recipeName}"
    ) {
        fun createRoute(
            recipeId: Int,
            recipeName: String
        ): String {
            return "addIngredients/$recipeId/$recipeName"
        }
    }

    // Rota para a tela de cadastro de modos de preparo da receita
    // passando o id e nome da receita como argumentos da rota
    object AddPreparationMethodsScreen : Destination(
        route = "addPreparationMethods/{recipeId}/{recipeName}"
    ) {
        fun createRoute(
            recipeId: Int,
            recipeName: String
        ): String {
            return "addPreparationMethods/$recipeId/$recipeName"
        }
    }

}