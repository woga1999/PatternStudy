package com.example.observerexample

import kotlin.String

class WeatherData : Subject {
    var displayObserverArrayList = ArrayList<Observer>()
    var temperature: String? = null
    var humidity: String? = null
    var pressure: String? = null
    var changed: Boolean = false

    override fun registerObserver(o: Observer) {
        displayObserverArrayList.add(o)
    }

    override fun removeObserver(o: Observer) {
        displayObserverArrayList?.let {
            displayObserverArrayList.removeAt(displayObserverArrayList.indexOf(o))
        }
    }

    override fun notifyObserversPushVersion() {
        displayObserverArrayList?.let {
            displayObserverArrayList.forEach {
                it.pushUpdate(temperature, humidity, pressure)
            }
        }
    }

    override fun notifyObserversPullVersion(subject: Subject){
        if(changed){
            displayObserverArrayList?.let {
                displayObserverArrayList.forEach {
                    it.pullUpdate()
                }
            }
        }
        changed = false
    }

    override var getTemperature: String?
        get() = temperature
        set(value) {}
    override var getHumidity: String?
        get() = humidity
        set(value) {}
    override var getPressure: String?
        get() = pressure
        set(value) {}

    private fun setChanged() {
        changed = true
    }

    private fun measurementsChanged(index:Int){
        when(index){
            0 -> notifyObserversPushVersion()
            1 -> {
                setChanged()
                notifyObserversPullVersion(this)
            }
        }
    }

    fun setMeasurements(temperature: String?, humidity: String?, pressure: String?, index:Int){
        this.temperature = temperature
        this.humidity = humidity
        this.pressure = pressure
        measurementsChanged(index)
    }

}