package com.example.factoryexample

class PepperoniPizza: Pizza {
    lateinit var pizzaIngredientFactory: PizzaIngredientFactory

    constructor(pizzaIngredientFactory: PizzaIngredientFactory){
        this.pizzaIngredientFactory = pizzaIngredientFactory
    }

    override fun prepare() {
        println("Preparing " + name)
        dough = pizzaIngredientFactory.createDough()
        sauce = pizzaIngredientFactory.createSauce()
    }
}