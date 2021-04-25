package com.example.templatemethodexample

class CaffeinTest: PrepareRecipe {

    override fun brew() {
        println("커피를 우려내는 중")
    }

    override fun addCondiment() {
        println("설탕과 어쩌구 추가")
    }

}