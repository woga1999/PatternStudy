package com.example.commandexample

class Light(var log: String?) {


    init{
        println("$log\n")
    }

    fun on(){
        println("Light On!\n")
    }
    fun off(){
        println("Light Off!\n")
    }
}