package br.com.fiap.recipes

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import br.com.fiap.recipes.screens.LoginScreen
import br.com.fiap.recipes.screens.SignupScreen
import br.com.fiap.recipes.ui.theme.RecipesTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        //enableEdgeToEdge()
        setContent {
            RecipesTheme {
                //InitialScreen()
                //SignupScreen()
                LoginScreen()
            }
        }
    }
}