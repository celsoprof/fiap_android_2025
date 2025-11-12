package br.com.fiap.recipes.navigation

sealed class Destination(val route: String){
    object InitialScreen: Destination("initial")
    object SignupScreen: Destination("signup")

    //object ProfileScreen: Destination("profile")
    object ProfileScreen: Destination("profile/{email}"){
        fun createRoute(email: String): String{
            return "profile/$email"
        }
    }

    object HomeScreen: Destination("home/{email}"){
        fun createRoute(email: String): String {
            return "home/$email"
        }
    }
    // TRECHO DE CÓDIGO OMITIDO
    object CategoryRecipeScreen: Destination("categoryRecipes/{id}"){
        fun createRoute(id: Int): String {
            return "categoryRecipes/$id"
        }
    }

    // Rota para a tela de cadastro de ingredientes da receita
    // passando o id e nome da receita como argumentos da rota
    object AddRecipeIngredientsScreen: Destination("addIngredients/{recipeId}/{recipeName}"){
        fun createRoute(recipeId: Int, recipeName: String): String {
            return "addIngredients/$recipeId/$recipeName"
        }
    }

    object LoginScreen: Destination("login")
    object AddRecipeScreen: Destination("addRecipeSreen")

}