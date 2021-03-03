package com.example.observerexample

interface Subject {
    fun registerObserver(o:Observer)
    fun removeObserver(o:Observer)
    fun notifyObserversPushVersion()
    fun notifyObserversPullVersion(subject: Subject)
    var getTemperature: String?
    var  getHumidity: String?
    var getPressure: String?
}