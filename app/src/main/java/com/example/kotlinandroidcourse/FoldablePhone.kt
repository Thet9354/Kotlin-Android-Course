package com.example.kotlinandroidcourse

fun main() {
    val foldablePhone = FoldablePhone()

    foldablePhone.switchOn()
    foldablePhone.checkPhoneScreenLight()

    foldablePhone.fold()
    foldablePhone.switchOn()
    foldablePhone.checkPhoneScreenLight()

    foldablePhone.unfold()
    foldablePhone.switchOn()
    foldablePhone.checkPhoneScreenLight()
}

open class Phone(var isScreenLightOn: Boolean = false){
    open fun switchOn() {
        isScreenLightOn = true
    }

    fun switchOff() {
        isScreenLightOn = false
    }

    fun checkPhoneScreenLight() {
        val phoneScreenLight = if (isScreenLightOn) "on" else "off"
        println("The phone screen's light is $phoneScreenLight.")
    }
}

class FoldablePhone(isFolded: Boolean = false) : Phone() {
    private var folded = isFolded

    override fun switchOn() {
        if (!folded) {
            isScreenLightOn = true
        }
    }

    fun fold() {
        folded = true
    }

    fun unfold() {
        folded = false
    }

    fun isFolded(): Boolean {
        return folded
    }
}
