package com.example.factoryexample

abstract class Pizza {
    lateinit var name: String
    lateinit var dough: Dough
    lateinit var sauce: Sauce

    abstract fun prepare()

    fun bake(){
        println("Bake fro 25 minutes at 350")
    }

    fun cut(){
        println("Cutting the pizza into diagonal slices")
    }

    fun box(){
        println("Place pizza in official PizzaStore box")
    }

    fun pizzaToString(): String {
        return ""
    }
}