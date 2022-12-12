package Bebas

import kotlin.math.*

fun main() {
    val latS = -6.9265143
    val lonS = 107.5995222

    val latD = -6.915452
    val lonD = 107.600393

    println("${distance(latS, lonS, latD, lonD)}")
}

private fun distance(latSrc: Double, lonSrc: Double, latDest: Double, lonDest: Double): Double {
    val latS = Math.toRadians(latSrc)
    val lonS = Math.toRadians(lonSrc)
    val latD = Math.toRadians(latDest)
    val lonD = Math.toRadians(lonDest)

    val lonDifference = lonD - lonS
    val latDifference = latD - latS

    val a = sin(latDifference / 2).pow(2.0) + cos(latS) * cos(latD) * sin(lonDifference / 2).pow(2.0)
    val c = 2 * asin(sqrt(a))
    
    val earthRadius = 6371 // Earth radius in kilometer (3956 miles)
    return c * earthRadius
}