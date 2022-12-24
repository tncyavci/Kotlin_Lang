package com.tuncayavci.kotlincollections

fun main() {
    //In Kotlin Collections can have read-only or mutable structure.
    //Collection Types
    //1- List 2-Set(Elements are unique) 3-Map (key and value, keys are unique)
    //These three types have read-only structure
    // list and Set class inherit Collection.

    val numList = listOf("three","four","five","six")
    val numSet = setOf("seven","eight","nine","ten")

    printAll(numSet)
    printAll(numList)
}

private fun printAll(collection : Collection<String>) {
    for (element in collection){
        println("Element : $element")
    }
}