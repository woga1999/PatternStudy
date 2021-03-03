package com.example.observerexample

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val weatherData = WeatherData()
        val display1 = Display1(weatherData, textViewDisplay1)
        val display2 = Display2(weatherData, textViewDisplay2)
        buttonDisplayUpdate.setOnClickListener {
            weatherData.setMeasurements(editTextTemperature.text.toString(), editTextHumidity.text.toString(), editTextPressure.text.toString())
        }
    }
}