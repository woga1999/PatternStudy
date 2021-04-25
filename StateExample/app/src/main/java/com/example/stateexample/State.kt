package com.example.stateexample

interface State {
    fun insertQuarter()
    fun ejectQuater()
    fun turnCrank()
    fun dispense()
}