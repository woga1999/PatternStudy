package com.example.decorateexample

class Mouse(var laptop: Laptop): LaptopDecorator() {
    override fun showDescription(): String = laptop.showDescription() + ", 마우스 추가"

    override fun cost(): Double = laptop.cost() + 5.2
}