package com.example.decorateexample

class Adapter(var laptop: Laptop): LaptopDecorator() {
    override fun showDescription(): String = laptop.showDescription() + ",\n어댑터 추가"

    override fun cost(): Double = laptop.cost() + 7.0
}