package com.example.factoryexample

abstract class PizzaStore() {
    abstract fun createPizza(item: String): Pizza
    fun orderPizza(type: String) {
        lateinit var pizza: Pizza
        pizza = createPizza(type)
        pizza.prepare()
        pizza.bake()
        pizza.cut()
        pizza.box()
        pizza.pizzaToString()
    }
}