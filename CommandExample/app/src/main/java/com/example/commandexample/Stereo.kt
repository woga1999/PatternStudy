package com.example.commandexample

class Stereo {
    fun on(){
        println("Stereo On\n")
    }
    fun off(){
        println("Stereo Off\n")
    }

    fun setCD(){
        println("Stereo set cd\n")
    }

    fun setDVD(){
        println("Stereo set dvd\n")
    }

    fun setRadio(){
        println("Stereo set radio\n")
    }

    fun setVolume(volume: Int){
        println("Stereo set volume: $volume\n")
    }
}