package com.example.factoryexample

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

/**
 * 추상 팩터리 패턴으로 구현한 예제
 */

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        var nyPizzaStore = NYPizzaStore()
        println("First Order Start!")
        nyPizzaStore.orderPizza("cheese")
        println("\nFirst Order Done!")

        println("\nSecond Order Start.")
        nyPizzaStore.orderPizza("pepperoni")
        println("\nSecond Order Done!")
    }
}