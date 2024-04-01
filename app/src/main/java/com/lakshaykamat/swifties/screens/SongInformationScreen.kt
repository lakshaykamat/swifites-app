package com.lakshaykamat.swifties.screens

import android.content.Intent
import android.net.Uri
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.navigation.NavBackStackEntry
import androidx.navigation.NavController
import com.lakshaykamat.swifties.R
import com.lakshaykamat.swifties.data.Albums
import com.lakshaykamat.swifties.data.Songs
import com.lakshaykamat.swifties.ui.components.ShareButton
import com.lakshaykamat.swifties.ui.components.TopBar

@Composable
fun SongInformationScreen(navController: NavController, backStackEntry: NavBackStackEntry) {
    val ctx = LocalContext.current
    val songName = remember {
        backStackEntry.arguments?.getString("songName")
    }
    val song = remember {
        Songs.get(songName ?: "")
    }
    val album = remember {
        Albums.getByName(song?.getAlbumName() ?: "")
    }
    Scaffold(
        topBar = { TopBar(navController = navController, title = song?.getName() ?: "") }
    ) { innerPadding ->
        if (song != null && album != null) {
            Column(
                modifier = Modifier
                    .padding(innerPadding)
                    .verticalScroll(rememberScrollState())
                    .padding(horizontal = 10.dp, vertical = 10.dp)
            ) {
                Row(
                    modifier = Modifier.fillMaxWidth(),
                    horizontalArrangement = Arrangement.Center
                ) {
                    Column {
                        Image(
                            modifier = Modifier
                                .size(170.dp)
                                .clip(RoundedCornerShape(5.dp)),
                            painter = painterResource(id = album.getCover()),
                            contentDescription = album.getName()
                        )
                        Spacer(modifier = Modifier.height(3.dp))
                        Text(
                            text = song.getAlbumName(),
                            style = MaterialTheme.typography.titleSmall
                        )
                    }

                }
                Spacer(modifier = Modifier.height(15.dp))
                Row(
                    modifier = Modifier.fillMaxWidth(),
                    verticalAlignment = Alignment.CenterVertically,
                    horizontalArrangement = Arrangement.SpaceBetween
                ) {
                    Text(
                        modifier = Modifier.fillMaxWidth(.7f),
                        text = song.getName(),
                        style = MaterialTheme.typography.titleLarge
                    )
                    Row(verticalAlignment = Alignment.CenterVertically, modifier = Modifier.fillMaxWidth()) {
                        IconButton(
                            onClick = {
                                val urlIntent = Intent(
                                    Intent.ACTION_VIEW,
                                    Uri.parse("https://www.spotify.com/")
                                )
                                ctx.startActivity(urlIntent)
                            },
                            modifier = Modifier.padding(8.dp)
                        ) {
                            Icon(
                                modifier = Modifier.size(28.dp),
                                painter = painterResource(id = R.drawable.spotify),
                                contentDescription = "Spotify",
                            )
                        }
                        ShareButton(content = song.getLyrics())
                    }
                }
                Spacer(modifier = Modifier.height(5.dp))
                Text(text = song.getDuration(), style = MaterialTheme.typography.titleSmall)
                Spacer(modifier = Modifier.height(10.dp))
                Text(text = song.getLyrics())

            }
        }
    }
}