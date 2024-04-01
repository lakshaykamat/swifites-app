package com.lakshaykamat.swifties.models

data class ReleaseDate(
    val month: String,
    val day: Int,
    val year: Int
) {
    override fun toString(): String {
        return "$day $month $year"
    }
}

data class Album(
    private val title: String,
    private val releaseDate: ReleaseDate,
    private val albumCover: Int,
    private val artist: String
) {
    fun getName(): String {
        return title
    }

    fun getCover(): Int {
        return albumCover
    }

    fun getArtistName(): String {
        return artist
    }

    fun getReleaseDate(): ReleaseDate {
        return releaseDate
    }
}