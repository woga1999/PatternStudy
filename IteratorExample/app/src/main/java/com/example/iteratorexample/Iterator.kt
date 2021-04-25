package com.example.iteratorexample


interface Iterator {
    fun hasNext(): Boolean
    fun next(): Any
    fun remove(position: Int)
}