package com.example.observerexample

interface Observer {
    fun update(temp:Float?, humidity:Float?, pressure:Float?)
}