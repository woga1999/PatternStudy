package com.example.commandexample

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var remoteControl = RemoteControl()
        var livingRoomLight = Light("Living Room")
        var livingRoomLightOn = LightOnCommand(livingRoomLight)
        var livingRoomLightOff = LightOffCommand(livingRoomLight)

        remoteControl.setCommand(0, livingRoomLightOn, livingRoomLightOff)

        remoteControl.onButtonWasPushed(0)
        remoteControl.offButtonWasPushed(0)
        println(remoteControl)
        remoteControl.undoButtonPushed()
        remoteControl.offButtonWasPushed(0)
        remoteControl.onButtonWasPushed(0)
        println(remoteControl)
        remoteControl.undoButtonPushed()
    }
}