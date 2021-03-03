package com.example.observerexample

import android.widget.TextView

interface Observer {
    fun update(temp:String?, humidity:String?, pressure:String?)
}