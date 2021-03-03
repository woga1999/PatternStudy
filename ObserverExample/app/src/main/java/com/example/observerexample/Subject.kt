package com.example.observerexample

interface Subject {
    fun registerObserver(o:Observer)
    fun removeObserver(o:Observer)
    fun notifyObservers()
}