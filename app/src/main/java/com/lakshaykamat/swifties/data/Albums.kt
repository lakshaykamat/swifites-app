package com.lakshaykamat.swifties.data

import com.lakshaykamat.swifties.R
import com.lakshaykamat.swifties.models.Album
import com.lakshaykamat.swifties.models.ReleaseDate

object Albums {
    private val albums = listOf(
        Album(
            title = "Taylor Swift",
            releaseDate = ReleaseDate("Oct", 24, 2006),
            albumCover = R.drawable.taylor_swift,
            artist = "Taylor Swift"
        ),
        Album(
            title = "Fearless",
            releaseDate = ReleaseDate("Nov", 11, 2008),
            albumCover = R.drawable.fearless,
            artist = "Taylor Swift"
        ),
        Album(
            title = "Speak Now",
            releaseDate = ReleaseDate("Oct", 25, 2010),
            albumCover = R.drawable.speak_now,
            artist = "Taylor Swift"
        ),
        Album(
            title = "Red",
            releaseDate = ReleaseDate("Oct", 22, 2012),
            albumCover = R.drawable.red,
            artist = "Taylor Swift"
        ),
        Album(
            title = "1989",
            releaseDate = ReleaseDate("Oct", 27, 2014),
            albumCover = R.drawable.ts_1989,
            artist = "Taylor Swift"
        ),
        Album(
            title = "Reputation",
            releaseDate = ReleaseDate("Nov", 10, 2017),
            albumCover = R.drawable.reputation,
            artist = "Taylor Swift"
        ),
        Album(
            title = "Lover",
            releaseDate = ReleaseDate("Aug", 23, 2019),
            albumCover = R.drawable.lover,
            artist = "Taylor Swift"
        ),
        Album(
            title = "Folklore",
            releaseDate = ReleaseDate("Jul", 24, 2020),
            albumCover = R.drawable.folklore,
            artist = "Taylor Swift"
        ),
        Album(
            title = "evermore",
            releaseDate = ReleaseDate("Dec", 11, 2020),
            albumCover = R.drawable.evermore,
            artist = "Taylor Swift"
        ),
        Album(
            title = "Midnights",
            releaseDate = ReleaseDate("Oct", 21, 2022),
            albumCover = R.drawable.midnights,
            artist = "Taylor Swift"
        )
    )
    fun getAll(): List<Album> {
        return albums
    }
    fun getByName(name:String): Album? {
       return albums.find { album-> name== album.getName()  }
    }
}