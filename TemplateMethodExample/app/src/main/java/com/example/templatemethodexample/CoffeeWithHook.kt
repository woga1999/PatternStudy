package com.example.templatemethodexample

class CoffeeWithHook(isCondiment: Boolean): CaffeinBeverageWithHook() {
    var isCondiment: Boolean = isCondiment

    override fun brew() {
        println("필터로 커피 우려내는 중..")
    }

    override fun addCondiments() {
        println("우유와 설탕을 추가하는 중")
    }

    override fun customerWantsCondiments(): Boolean {
        return isCondiment
    }

}