package com.example.observerexample

import android.text.Editable
import android.widget.TextView

class Display1 : Observer, DisplayElement {
    private var temp: String? = null
    private var humidity: String? = null
    private var pressure: String? = null
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
        this.pressure = pressure
        disply()
    }

    override fun disply() {
        textView.text = "여기는 Display1 온도는 " + temp + "\n습도는 " + humidity + "\n압력은 " + pressure
    }
}