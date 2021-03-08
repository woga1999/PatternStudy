package com.example.decorateexample

class Keyboard(var laptop: Laptop): LaptopDecorator() {
    override fun showDescription(): String = laptop.showDescription() + ", 키보드 추가"

    override fun cost(): Double = laptop.cost() + 13.2
}