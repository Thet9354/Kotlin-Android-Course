package com.example.kotlinandroidcourse

fun main() {
    val amanda = Person("Amanda", 33, "play tennis", null)
    val atiqah = Person("Atiqah", 28, "climb", amanda)

    amanda.showProfile()
    atiqah.showProfile()
}

class Person(val name: String, val age: Int, val hobby: String?, val referrer: Person?) {
    fun showProfile() {
        println("Name: $name")
        println("Age: $age")

        val hobbyDescription = if (hobby != null) "Likes to $hobby." else "Doesn't have a hobby."
        println(hobbyDescription)

        if (referrer != null) {
            println("Has a referrer named ${referrer.name}, who ${if (referrer.hobby != null) "likes to ${referrer.hobby}." else "doesn't have a hobby."}")
        } else {
            println("Doesn't have a referrer.")
        }
        println()
    }
}
