package com.example.templatemethodexample

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var tea = Tea()
        var coffee = Coffee()

        println("[[[[tea recipe]]]]")
        tea.prepareRecipe()

        println("\n[[[[coffee recipe]]]]")
        coffee.prepareRecipe()

        var coffeeWithHook = CoffeeWithHook(false)
        println("\n[[[[coffee with hook]]]]")
        coffeeWithHook.prepareRecipe()

        println("\n[[[[one more try coffee with hook]]]]")
        coffeeWithHook.prepareRecipe2(false)

        println("\n[[[[test]]]]")

        var test = CaffeinTest()
        test.prepare()
    }
}