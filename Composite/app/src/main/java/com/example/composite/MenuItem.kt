package com.example.composite

class MenuItem(name: String, description: String, vegetarian: Boolean, price: Double): MenuComponent() {
    private val name = name
    private val description = description
    private val vegetarian = vegetarian
    private val price = price

    override fun getName(): String {
        return name
    }

    override fun getDescription(): String {
        return description
    }

    override fun getPrice(): Double {
        return price
    }

    override fun isVegetarian(): Boolean {
        return vegetarian
    }

    override fun print() {
        print(" " + getName())
        if (isVegetarian()){
            print("[v]")
        }
        println(", " + getPrice())
        println("     -- " + getDescription())
    }
}