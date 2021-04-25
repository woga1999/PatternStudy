package com.example.stateexample

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var gumballMachine = GumballMachine(5)

        println(gumballMachine)
        println("-----------------------")

        gumballMachine.insertQuarter()
        gumballMachine.turnCrank()

        println("-----------------------")
        println(gumballMachine)
        println("-----------------------")

        gumballMachine.insertQuarter()
        gumballMachine.ejectQuarter()
        gumballMachine.turnCrank()

        println("-----------------------")
        println(gumballMachine)
        println("-----------------------")

        gumballMachine.insertQuarter()
        gumballMachine.turnCrank()
        gumballMachine.insertQuarter()
        gumballMachine.turnCrank()
        gumballMachine.ejectQuarter()

        println("-----------------------")
        println(gumballMachine)
        println("-----------------------")

        gumballMachine.insertQuarter()
        gumballMachine.insertQuarter()
        gumballMachine.turnCrank()
        gumballMachine.insertQuarter()
        gumballMachine.turnCrank()
        gumballMachine.insertQuarter()
        gumballMachine.turnCrank()

        println("-----------------------")
        println(gumballMachine)
    }
}