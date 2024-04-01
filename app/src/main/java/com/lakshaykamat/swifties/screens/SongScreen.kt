package com.lakshaykamat.swifties.screens

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.Card
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.unit.dp
import androidx.navigation.NavBackStackEntry
import androidx.navigation.NavController
import com.lakshaykamat.swifties.data.Songs
import com.lakshaykamat.swifties.models.Screen
import com.lakshaykamat.swifties.models.Song
import com.lakshaykamat.swifties.ui.components.TopBar

@Composable
fun SongScreen(navController: NavController, backStackEntry: NavBackStackEntry) {
    val albumName = backStackEntry.arguments?.getString("albumName")


    val albumSongs = remember { Songs.filterByAlbum(albumName ?: "") }

    Scaffold(
        topBar = {
            if (albumName != null) {
                TopBar(navController = navController, title = albumName)
            }
        }
    ) { innerPadding ->
        Column(
            modifier = Modifier
                .padding(innerPadding)
                .padding(horizontal = 10.dp)
                .verticalScroll(rememberScrollState())
        ) {
            albumSongs.forEach { song ->
                SongCard(song = song) {
                    navController.navigate(Screen.SongInfo.rout + "/${song.getName()}")
                }
            }
        }
    }
}

@Composable
private fun SongCard(song: Song, onClick: () -> Unit) {
    Card(
        modifier = Modifier
            .padding(8.dp)
            .fillMaxWidth()
            .clickable { onClick() }
    ) {
        Column(modifier = Modifier.padding(horizontal = 8.dp, vertical = 16.dp)) {

            Text(
                text = song.getName(),
                style = MaterialTheme.typography.titleMedium,
                overflow = TextOverflow.Clip
            )
            Spacer(modifier = Modifier.height(8.dp))
            Row(
                modifier = Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.SpaceBetween
            ) {
                Text(text = song.getDuration(), style = MaterialTheme.typography.bodyMedium)
                Text(text = song.getArtistName(), style = MaterialTheme.typography.bodyMedium)
            }

        }
    }
}
