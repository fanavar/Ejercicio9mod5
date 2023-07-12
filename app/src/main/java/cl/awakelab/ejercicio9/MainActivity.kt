package cl.awakelab.ejercicio9

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

fun main(){
    println("ingresar valor")

    val input = readLine()!!.toDouble()

    val fahrenheit = (9/5) * input + 32

    println("Fahrenheit: $fahrenheit")

    val kelvin = input + 273.15

    println("Kelvin: $kelvin")

    val fahrenheitToKelvin = 5.0/9.0 * (fahrenheit - 32) + 273.15

    println ("Farenheit a Kelvin $fahrenheitToKelvin")
}


fun isLetters(string: String): Boolean{
    return string.none { it !in 'A'  ..  'Z' && it !in 'a'  ..  'z'}
}