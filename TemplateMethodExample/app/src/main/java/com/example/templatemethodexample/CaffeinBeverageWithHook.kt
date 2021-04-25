package com.example.templatemethodexample

abstract class CaffeinBeverageWithHook {

    fun prepareRecipe(){
        boilWater()

        brew()

        pourInCup()

        if(customerWantsCondiments()) addCondiments()
    }

    fun prepareRecipe2(isCondiment: Boolean){
        boilWater()

        brew()

        pourInCup()

        if(customerWantsCondiments2(isCondiment)) addCondiments()
    }

    abstract fun brew()

    abstract fun addCondiments()

    private fun boilWater(){
        println("물 끓이는 중...")
    }

    private fun pourInCup(){
        println("컵에 따르는 중...")
    }

    open fun customerWantsCondiments(): Boolean {
        println("Caffein WithHook Method") //알고리즘대로 진행하면서 호출
        return true
    }

    fun customerWantsCondiments2(isCondiment: Boolean): Boolean {
        return isCondiment
    }

}