package com.example.observerexample

class WeatherData : Subject {
    var displayObserverArrayList = ArrayList<Observer>()
    var temperature: String? = null
    var humidity: String? = null
    var pressure: String? = null

    override fun registerObserver(o: Observer) {
        displayObserverArrayList.add(o)
    }

    override fun removeObserver(o: Observer) {
        displayObserverArrayList?.let {
            displayObserverArrayList.removeAt(displayObserverArrayList.indexOf(o))
        }
    }

    override fun notifyObservers() {
        displayObserverArrayList?.let {
            displayObserverArrayList.forEach {
                it.update(temperature, humidity, pressure)
            }
        }
    }

    fun measurementsChanged(){
        notifyObservers()
    }

    fun setMeasurements(temperature: String?, humidity: String?, pressure: String?){
        this.temperature = temperature
        this.humidity = humidity
        this.pressure = pressure
        measurementsChanged()
    }
}