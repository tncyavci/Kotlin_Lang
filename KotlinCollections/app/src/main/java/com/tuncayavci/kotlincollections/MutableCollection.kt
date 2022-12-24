package com.tuncayavci.kotlincollections

fun main() {
    // Mutable Collections
    //They are Collections with features such as adding, deleting and updating.

    val series = ("Westworld TheWire BreakingBad GameOfThrones").split(" ")

    val goodFinals = mutableListOf<String>()

    series.removeBadFinals(goodFinals)

    println(goodFinals)


}

private fun List<String>.removeBadFinals(series : MutableList<String>) {
    this.filterTo(series) { true }
    val badFinals = setOf("GameOfThrones","Westworld")
    series -= badFinals
}