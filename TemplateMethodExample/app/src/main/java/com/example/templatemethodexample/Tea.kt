package com.example.templatemethodexample

class Tea: CaffeinBeverage() {

    override fun brew() {
        println("차를 우려낸다")
    }

    override fun addCondiments() {
        println("레몬 추가한다")
    }
}