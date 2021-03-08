package com.example.decorateexample

abstract class LaptopDecorator: Laptop() {
    abstract override fun getDescription(): String
}