package br.com.fiap.recipes.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import br.com.fiap.recipes.screens.InitialScreen
import br.com.fiap.recipes.screens.LoginScreen
import br.com.fiap.recipes.screens.SignupScreen

@Composable
fun NavigationRoutes() {
    val navController = rememberNavController();
    NavHost(
        navController = navController,
        startDestination = InitialScreenRoute
    ) {
        composable<LoginScreenRoute> {
            LoginScreen{
                navController.navigate(SignupScreenRoute)
            }
        }
        // TRECHO DE CÓDIGO OMITIDO
        composable<InitialScreenRoute> {
            InitialScreen { screen ->
                when (screen) {
                    "Login" -> navController.navigate(LoginScreenRoute)
                    else -> navController.navigate(SignupScreenRoute)
                }
            }
        }
        // TRECHO DE CÓDIGO OMITIDO
        composable<SignupScreenRoute> { SignupScreen() }
    }
}