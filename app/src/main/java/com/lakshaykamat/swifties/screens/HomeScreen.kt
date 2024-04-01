package com.lakshaykamat.swifties.screens

import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import com.lakshaykamat.swifties.R
import com.lakshaykamat.swifties.data.Quotes
import com.lakshaykamat.swifties.models.Screen
import com.lakshaykamat.swifties.ui.components.TopBar

@Composable
fun HomeScreen(navController: NavController) {
    Scaffold(
        topBar = {
            TopBar(
                haveBackButton = false,
                navController = navController,
                title = stringResource(id = R.string.app_name)
            )
        }
    ) { innerPadding ->

        Column(
            modifier = Modifier.padding(innerPadding).padding(horizontal = 10.dp)
        ) {
            Image(
                painter = painterResource(R.drawable.jwell),
                contentDescription = stringResource(id = R.string.taylor_swift),
                contentScale = ContentScale.FillWidth,
                modifier = Modifier
                    .padding(vertical = 12.dp)
                    .clip(RoundedCornerShape(percent = 4))
            )

            QuoteAndButton(
                quote = remember { Quotes.randomQuote() }.text(),
                author = "Taylor Swift"
            )

            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(vertical = 16.dp),
                horizontalArrangement = Arrangement.SpaceAround
            ) {
                IconsCardWithLabel(icon = R.drawable.album_icon, label = "Albums") {
                    navController.navigate(Screen.Album.rout)
                }
                IconsCardWithLabel(icon = R.drawable.quote_icon, label = "Quotes") {
                    navController.navigate(Screen.Quote.rout)
                }
            }
        }
    }
}

@Composable
private fun QuoteAndButton(quote: String, author: String) {
    Column {
        Text(
            style = MaterialTheme.typography.bodyLarge,
            fontStyle = FontStyle.Italic,
            color = Color.Gray,
            text = quote
        )
        Spacer(modifier = Modifier.height(8.dp))

        Text(
            style = MaterialTheme.typography.bodyLarge,
            fontStyle = FontStyle.Italic,
            color = Color.Gray,
            text = "- $author"
        )
    }
}

@Composable
private fun IconsCardWithLabel(icon: Int, label: String, goToScreen: () -> Unit) {
    Card(
        modifier = Modifier
            .width(100.dp)
            .clickable { goToScreen() }
    ) {
        Column(
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally,
            modifier = Modifier
                .fillMaxWidth()
                .padding(16.dp)
        ) {
            Icon(
                painter = painterResource(id = icon),
                contentDescription = null, // Since it's decorative
                tint = MaterialTheme.colorScheme.primary,
                modifier = Modifier.size(28.dp)
            )
            Spacer(modifier = Modifier.height(8.dp))
            Text(text = label, style = MaterialTheme.typography.labelSmall)
        }
    }
}
