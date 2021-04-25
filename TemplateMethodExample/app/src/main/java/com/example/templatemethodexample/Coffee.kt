package com.example.templatemethodexample

class Coffee: CaffeinBeverage() {
    override fun brew() {
        println("커피를 우려낸다")
    }

    override fun addCondiments() {
        println("설탕과 우유를 추가한다")
    }
}