package com.lakshaykamat.swifties.ui.components

import android.content.Intent
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Share
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp

@Composable
fun ShareButton(content: String,size: Dp =28.dp) {
    val context = LocalContext.current

    IconButton(
        onClick = {
            val intent = Intent().apply {
                action = Intent.ACTION_SEND
                putExtra(Intent.EXTRA_TEXT, content)
                type = "text/plain"
            }
            context.startActivity(Intent.createChooser(intent, "Share via"))
        },
        modifier = Modifier.padding(8.dp).size(size)
    ) {
        Icon(
            imageVector = Icons.Filled.Share,
            contentDescription = "Share",
        )
    }
}