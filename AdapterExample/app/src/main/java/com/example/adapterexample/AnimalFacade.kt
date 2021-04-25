package com.example.adapterexample

class AnimalFacade {
    var mallardDuck: Duck
    var wildTurkey: Turkey

    init{
        mallardDuck = MallardDuck()
        wildTurkey = WildTurkey()
    }

    fun print(){
        println("Turkey says...")
        wildTurkey.gobble()
        wildTurkey.fly()

        println("\nThe duck says...")
        mallardDuck.fly()
        mallardDuck.quack()
    }

}