package com.lakshaykamat.swifties.screens

import androidx.compose.foundation.clickable
import androidx.compose.foundation.horizontalScroll
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.wrapContentSize
import androidx.compose.foundation.layout.wrapContentWidth
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.Card
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.MutableState
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.lifecycle.ViewModel
import androidx.navigation.NavController
import com.lakshaykamat.swifties.data.Albums
import com.lakshaykamat.swifties.data.Quotes
import com.lakshaykamat.swifties.models.Album
import com.lakshaykamat.swifties.models.Quote
import com.lakshaykamat.swifties.ui.components.ShareButton
import com.lakshaykamat.swifties.ui.components.TopBar

class QuoteViewModel : ViewModel() {
    val albums: MutableState<List<Album>> = mutableStateOf(Albums.getAll())
}

@Composable
fun QuoteScreen(navController: NavController, viewModel: QuoteViewModel = QuoteViewModel()) {
    val albums by viewModel.albums

    var filteredQuotes by remember {
        mutableStateOf(
            Quotes.filterByAlbum(
                albums.random().getName()
            )
        )
    }

    Scaffold(
        topBar = { TopBar(navController = navController, title = "Quotes") }
    ) { innerPadding ->
        Column(
            modifier = Modifier
                .padding(innerPadding)
                .padding(horizontal = 10.dp)
                .verticalScroll(rememberScrollState())
        ) {
            AlbumButtonsRow(albums = albums) { albumName ->
                filteredQuotes = Quotes.filterByAlbum(albumName)
            }
            Column {
                filteredQuotes.forEach { q -> QuoteCard(quote = q) }
            }
        }
    }
}


@Composable
private fun AlbumButtonsRow(albums: List<Album>, onAlbumSelected: (String) -> Unit) {
    Row(
        modifier = Modifier
            .wrapContentSize()
            .wrapContentWidth()
            .horizontalScroll(
                rememberScrollState()
            ),
        verticalAlignment = Alignment.Top,
        horizontalArrangement = Arrangement.spacedBy(8.dp)
    ) {
        albums.forEach { album ->
            AlbumButton(album.getName()) {
                onAlbumSelected(album.getName())
            }

        }
    }
}

@Composable
private fun AlbumButton(albumName: String, onClick: () -> Unit) {
    Text(
        modifier = Modifier
            .padding(5.dp)
            .clickable { onClick() },
        text = albumName,
        style = MaterialTheme.typography.bodySmall,
    )
}


@Composable
private fun QuoteCard(quote: Quote) {
    Card(
        modifier = Modifier
            .padding(8.dp)
            .fillMaxWidth()
    ) {
        Column(
            modifier = Modifier.padding(
                horizontal = 8.dp, vertical = 16.dp
            )
        ) {
            Text(
                text = quote.text(),
                style = MaterialTheme.typography.titleMedium
            )
            Spacer(modifier = Modifier.height(12.dp))
            Row(
                modifier = Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.SpaceBetween
            ) {
                Column(verticalArrangement = Arrangement.SpaceAround) {
                    Text(
                        text = quote.getSongName(),
                        style = MaterialTheme.typography.bodyLarge
                    )
                    Text(
                        text = quote.getAlbumName(),
                        style = MaterialTheme.typography.bodyMedium
                    )
                }
                ShareButton(content = quote.text())
            }

        }
    }
}
