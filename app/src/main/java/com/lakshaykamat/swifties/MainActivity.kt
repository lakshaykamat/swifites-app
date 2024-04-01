package com.lakshaykamat.swifties

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.NavType
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import androidx.navigation.navArgument
import com.lakshaykamat.swifties.models.Screen
import com.lakshaykamat.swifties.screens.*
import com.lakshaykamat.swifties.ui.theme.SwiftiesTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            SwiftiesTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    App()
                }
            }
        }
    }
}
@Composable
fun App() {
    val navController = rememberNavController()

    NavHost(navController = navController, startDestination = Screen.Home.rout) {
        composable(Screen.Home.rout) {
            HomeScreen(navController)
        }

        composable(Screen.Album.rout) {
            AlbumScreen(navController)
        }

        composable(
            Screen.Song.rout + "/{albumName}",
            arguments = listOf(
                navArgument("albumName") { type = NavType.StringType }
            )
        ) { backStackEntry ->
            SongScreen(navController = navController, backStackEntry = backStackEntry)
        }


        composable(Screen.Quote.rout) {
            QuoteScreen(navController)
        }

        composable(
            Screen.SongInfo.rout + "/{songName}",
            arguments = listOf(
                navArgument("songName") { type = NavType.StringType }
            )
        ) { backStackEntry ->
            SongInformationScreen(navController, backStackEntry = backStackEntry)
        }
    }

}
@Composable
fun Greeting(name: String, modifier: Modifier = Modifier) {
    Text(
        text = "Hello $name!",
        modifier = modifier
    )
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    SwiftiesTheme {
        Greeting("Android")
    }
}