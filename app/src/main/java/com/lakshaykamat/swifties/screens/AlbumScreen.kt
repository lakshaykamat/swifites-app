package com.lakshaykamat.swifties.screens

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.layout.wrapContentWidth
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
import androidx.compose.foundation.lazy.grid.items
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.Card
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import com.lakshaykamat.swifties.data.Albums
import com.lakshaykamat.swifties.models.Album
import com.lakshaykamat.swifties.models.Screen
import com.lakshaykamat.swifties.ui.components.TopBar

@Composable
fun AlbumScreen(navController: NavController) {
    val albums = remember { Albums.getAll() }// Assuming albums is a list of AlbumHelper objects

    Scaffold(
        topBar = { TopBar(navController = navController, title = "Albums") }
    ) { innerPadding ->
        if (albums.isNotEmpty()) {
            LazyVerticalGrid(
                columns = GridCells.Fixed(2),
                modifier = Modifier
                    .fillMaxSize()
                    .padding(innerPadding)
                    .padding(horizontal = 10.dp)
            ) {
                items(albums) { album ->
                    AlbumCard(album = album) {
                        navController.navigate(Screen.Song.rout + "/${album.getName()}")
                    }
                }
            }
        } else {
            Text(
                text = "No albums found",
                style = MaterialTheme.typography.bodyLarge,
                modifier = Modifier
                    .fillMaxSize()
                    .padding(16.dp)
                    .wrapContentWidth(Alignment.CenterHorizontally)
            )
        }
    }
}

@Composable
private fun AlbumCard(album: Album, onClick: () -> Unit) {
    Card(
        modifier = Modifier
            .width(200.dp)
            .padding(8.dp),
        shape = RoundedCornerShape(8.dp),
    ) {
        Column(
            modifier = Modifier.padding(16.dp),
            horizontalAlignment = Alignment.Start
        ) {
            Image(
                modifier = Modifier.fillMaxWidth().size(150.dp).clip(RoundedCornerShape(5.dp)),
                painter = painterResource(id = album.getCover()),
                contentDescription = album.getName()
            )
            Spacer(modifier = Modifier.height(8.dp))
            Column {
                Text(
                    text = album.getName(),
                    style = MaterialTheme.typography.bodyLarge,
                )
                Spacer(modifier = Modifier.height(4.dp))
                Text(
                    text = album.getReleaseDate().toString(),
                    style = MaterialTheme.typography.bodyMedium,
                )

            }
            Spacer(modifier = Modifier.height(4.dp))
            Column(modifier = Modifier.fillMaxWidth()) {
                Button(modifier = Modifier.fillMaxWidth(), onClick = { onClick() }) {
                    Text(text = "Songs")
                }
            }
        }
    }
}



