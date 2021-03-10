package com.example.factoryexample

interface PizzaIngredientFactory {
    fun createDough(): Dough
    fun createSauce(): Sauce
}