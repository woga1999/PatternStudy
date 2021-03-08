package com.example.decorateexample

class Apple(description: String): Laptop(description) {
    override fun cost(): Double = 128.0
}