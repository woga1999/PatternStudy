package com.example.templatemethodexample

interface PrepareRecipe {
    fun prepare(){
        brew()
        boilWater()
        addCondiment()
        pourInCup()
    }
    fun brew(){
    }
    fun boilWater(){
        println("물 따르는 중")
    }
    fun addCondiment()
    fun pourInCup(){
        println("컵에 따르는 중")
    }
}