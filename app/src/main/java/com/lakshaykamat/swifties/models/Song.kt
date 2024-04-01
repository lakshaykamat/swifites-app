package com.lakshaykamat.swifties.models

data class Song(
    private val name: String,
    private val artist: String,
    private val duration: String,
    private val lyrics: String,
    private val album: String
) {
    fun getName(): String {
        return name
    }

    fun getArtistName(): String {
        return artist
    }

    fun getDuration(): String {
        return duration
    }

    fun getLyrics(): String {
        return lyrics
    }

    fun getAlbumName(): String {
        return album
    }
}