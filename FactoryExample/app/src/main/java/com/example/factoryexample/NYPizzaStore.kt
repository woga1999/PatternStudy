package com.example.factoryexample

class NYPizzaStore: PizzaStore() {

    override fun createPizza(item: String): Pizza {
        lateinit var pizza: Pizza
        var ingredientFactory: PizzaIngredientFactory = NYPizzaIngredientFactory()

        if (item == "cheese"){
            pizza = CheesePizza(ingredientFactory)
            pizza.name = "New York Style Cheese Pizza"
        }
        else if (item == "pepperoni"){
            pizza = PepperoniPizza(ingredientFactory)
            pizza.name = "New York Style Pepperoni Pizza"
        }
        return pizza
    }

}