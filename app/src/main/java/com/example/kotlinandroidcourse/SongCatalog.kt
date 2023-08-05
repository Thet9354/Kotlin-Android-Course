package com.example.kotlinandroidcourse

fun main() {
    val song1 = Song("Bohemian Rhapsody", "Queen", 1975, 2500)
    val song2 = Song("Shape of You", "Ed Sheeran", 2017, 800)

    song1.printSongDescription()
    println("Song1 is popular: ${song1.isPopular}")

    song2.printSongDescription()
    println("Song2 is popular: ${song2.isPopular}")
}

class Song(
    val title: String,
    val artist: String,
    val yearPublished: Int,
    val playCount: Int
) {
    val isPopular: Boolean
        get() = playCount >= 1000

    fun printSongDescription() {
        println("$title, performed by $artist, was released in $yearPublished.")
    }
}

