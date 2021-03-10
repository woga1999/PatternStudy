package com.example.factoryexample

abstract class PizzaStore() {
    abstract fun createPizza(item: String): Pizza
    fun orderPizza(type: String) {
        var pizza: Pizza = createPizza(type)
        pizza.prepare()
        pizza.bake()
        pizza.cut()
        pizza.box()
        
        println(pizza.pizzaToString())
    }
}