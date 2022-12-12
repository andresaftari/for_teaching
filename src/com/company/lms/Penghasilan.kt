package com.company.lms

import java.util.Scanner

fun main() {
    val scanner = Scanner(System.`in`)

    val pajak: Long
    val besarPajak: Long
    val penghasilanBersih: Long

    var penghasilanKotor = scanner.nextLong()

    pajak = when (penghasilanKotor) {
        in 0..50 -> 5
        in 51..250 -> 15
        in 251..500 -> 25
        else -> 30
    }

    println("Penghasilan Kotor = $penghasilanKotor Juta Rupiah")

    penghasilanKotor *= 1000000
    besarPajak = (penghasilanKotor * pajak) / 100
    penghasilanBersih = penghasilanKotor - besarPajak

    println("Pajak ${penghasilanKotor - besarPajak}% = Rp.$besarPajak")
    println("Penghasilan bersih Rp.$penghasilanBersih")
}