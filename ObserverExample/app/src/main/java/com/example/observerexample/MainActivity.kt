package com.example.observerexample

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val weatherData = WeatherData()
        Display1(weatherData, textViewDisplay1)
        Display2(weatherData, textViewDisplay2)

        btn_pushdisplayupdate.setOnClickListener {
            weatherData.setMeasurements(editTextTemperature.text.toString(), editTextHumidity.text.toString(), editTextPressure.text.toString())
        }
    }
}