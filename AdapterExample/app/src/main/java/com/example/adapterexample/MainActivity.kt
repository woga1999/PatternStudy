package com.example.adapterexample

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ProgressBar

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

//        val duck = MallardDuck()
//        val turkey = WildTurkey()
//        val turkeyAdapter = TurkeyAdapter(turkey)
//
//        println("Turkey says...")
//        turkey.gobble()
//        turkey.fly()
//
//        println("\nThe duck says...")
//        duck.fly()
//        duck.quack()
//
//        println("\nThe Turkey Adapter says")
//        turkeyAdapter.quack()
//        turkeyAdapter.fly()
        val animalFacade = AnimalFacade()
        animalFacade.print()
    }
}