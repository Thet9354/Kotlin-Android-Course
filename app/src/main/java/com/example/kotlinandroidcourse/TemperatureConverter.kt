package com.example.kotlinandroidcourse

fun main() {
    val celsiusToFahrenheit: (Double) -> Double = { celsius -> (9.0 / 5.0 * celsius) + 32 }
    val kelvinToCelsius: (Double) -> Double = { kelvin -> kelvin - 273.15 }
    val fahrenheitToKelvin: (Double) -> Double = { fahrenheit -> (5.0 / 9.0) * (fahrenheit - 32) + 273.15 }

    printFinalTemperature(27.0, "Celsius", "Fahrenheit", celsiusToFahrenheit)
    printFinalTemperature(350.0, "Kelvin", "Celsius", kelvinToCelsius)
    printFinalTemperature(10.0, "Fahrenheit", "Kelvin", fahrenheitToKelvin)
}

fun printFinalTemperature(
    initialMeasurement: Double,
    initialUnit: String,
    finalUnit: String,
    conversionFormula: (Double) -> Double
) {
    val finalMeasurement = String.format("%.2f", conversionFormula(initialMeasurement)) // two decimal places
    println("$initialMeasurement degrees $initialUnit is $finalMeasurement degrees $finalUnit.")
}
