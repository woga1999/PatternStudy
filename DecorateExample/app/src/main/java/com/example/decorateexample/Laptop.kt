package com.example.decorateexample

abstract class Laptop(var description: String = "") {
    open fun showDescription(): String = description
    abstract fun cost(): Double
}