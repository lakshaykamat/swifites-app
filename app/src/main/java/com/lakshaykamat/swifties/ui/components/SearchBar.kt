package com.lakshaykamat.swifties.ui.components

import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Search
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

@Composable
fun SearchBar(
    onSearchTextChanged: (String) -> Unit
) {
    val (text, setText) = remember { mutableStateOf("") }

    TextField(
        leadingIcon = {
            Icon(imageVector = Icons.Default.Search, contentDescription = null)
        },
        value = text,
        onValueChange = {
            setText(it)
            onSearchTextChanged(it)
        },
        placeholder = { Text("Search...") },
        modifier = Modifier
            .fillMaxWidth()
            .clip(RoundedCornerShape(30.dp))
    )
}

@Preview
@Composable
fun SearchBarPreview() {
    SearchBar(onSearchTextChanged = {})
}