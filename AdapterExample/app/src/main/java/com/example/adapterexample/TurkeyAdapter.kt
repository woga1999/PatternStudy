package com.example.adapterexample

class TurkeyAdapter(var turkey: Turkey): Duck {

    override fun quack() {
        turkey.gobble()
    }

    override fun fly() {
        for(i in 1..5) {
            println("hi!")
            turkey.fly()
        }
    }

}