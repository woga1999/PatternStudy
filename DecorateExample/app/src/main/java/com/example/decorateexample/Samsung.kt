package com.example.decorateexample

class Samsung(description: String): Laptop(description) {
    override fun cost(): Double = 103.0
}