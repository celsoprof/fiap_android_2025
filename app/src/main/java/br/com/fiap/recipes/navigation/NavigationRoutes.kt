package br.com.fiap.recipes.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import br.com.fiap.recipes.screens.InitialScreen
import br.com.fiap.recipes.screens.LoginScreen

@Composable
fun NavigationRoutes() {
    val navController = rememberNavController();
    NavHost(
        navController = navController,
        startDestination = InitialScreenRoute
    ){
        composable<LoginScreenRoute>{ LoginScreen() }
        composable<InitialScreenRoute>{ InitialScreen() }
    }
}