package com.example.observerexample

import android.widget.TextView

class Display2 : Observer, DisplayElement {
    private var temp: String? = null
    private var humidity: String? = null
    private var weatherData: Subject
    private var textView: TextView

    constructor(weatherData: Subject, textView: TextView){
        this.weatherData = weatherData
        this.textView = textView
        weatherData.registerObserver(this)
    }

    override fun update(temp: String?, humidity: String?, pressure: String?) {
        this.temp = temp
        this.humidity = humidity
        disply()
    }

    override fun disply() {
        textView.text = "여기는 Display2 온도는 " + temp + "습도는 " + humidity
    }
}