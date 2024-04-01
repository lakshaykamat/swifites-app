package com.lakshaykamat.swifties.models

sealed class Screen(val rout:String) {
    data object Home:Screen("home-screen")
    data object Album:Screen("album-screen")
    data object Song:Screen("song-screen")
    data object SongInfo:Screen("song-info-screen")
    data object Quote:Screen("quote-screen")
}