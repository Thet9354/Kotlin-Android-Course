package com.example.kotlinandroidcourse

fun main() {

//    listOfStuff()

//    mutableList()

//    Sets()

    MapCollection()

}

fun MapCollection() {

    val solarSystem = mutableMapOf(
        "Mercury" to 0,
        "Venus" to 0,
        "Earth" to 1,
        "Mars" to 2,
        "Jupiter" to 79,
        "Saturn" to 82,
        "Uranus" to 27,
        "Neptune" to 14
    )

    println(solarSystem.size)

    solarSystem["Pluto"] = 5 // setting additional key-value pairs

    println(solarSystem.size)

    println(solarSystem["Pluto"])

    println(solarSystem.get("Theia"))

    solarSystem.remove("Pluto")

    println(solarSystem.size)

    solarSystem["Jupiter"] = 78

    println(solarSystem["Jupiter"])
}

fun Sets() {

    val solarSystem = mutableSetOf("Mercury", "Venus", "Earth", "Mars", "Jupiter", "Saturn", "Uranus", "Neptune")

    println(solarSystem.size)

    solarSystem.add("Pluto")

    solarSystem.remove("Pluto")

    println(solarSystem.size)

    println(solarSystem.contains("Pluto"))

}

fun listOfStuff() {

    val solarSystem = listOf("Mercury", "Venus", "Earth", "Mars", "Jupiter", "Saturn", "Uranus", "Neptune")

    println(solarSystem.size)

    println(solarSystem.get(3))
    println(solarSystem.indexOf("Earth"))
    println(solarSystem.indexOf("Pluto"))

    for (planet in solarSystem) {
        println(planet)
    }
}

fun mutableList() {

    val solarSystem = mutableListOf("Mercury", "Venus", "Earth", "Mars", "Jupiter", "Saturn", "Uranus", "Neptune")
    solarSystem.add("Pluto")

    solarSystem.add(3, "Theia")

    solarSystem[3] = "Future Moon"

    println(solarSystem[3])
    println(solarSystem[9])

    solarSystem.removeAt(9)
    solarSystem.remove("Future Moon")

    println(solarSystem.contains("Pluto"))
    println("Future Moon" in solarSystem)

}

