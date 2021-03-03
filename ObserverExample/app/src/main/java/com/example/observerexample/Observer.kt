package com.example.observerexample

import android.widget.TextView

interface Observer {
    fun pushUpdate(temp:String?, humidity:String?, pressure:String?)
    fun pullUpdate()
}