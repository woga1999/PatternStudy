package com.example.observerexample

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val weatherData = WeatherData()
        Display1(weatherData, textview_display1)
        Display2(weatherData, textview_display2)

        btn_pushdisplayupdate.setOnClickListener {
            weatherData.setMeasurements(edit_temperature.text.toString(), edit_humidity.text.toString(), edit_pressure.text.toString(),0)
        }
        btn_pulldisplayupdate.setOnClickListener {
            weatherData.setMeasurements(edit_temperature.text.toString(), edit_humidity.text.toString(), edit_pressure.text.toString(),1)
        }
    }
}