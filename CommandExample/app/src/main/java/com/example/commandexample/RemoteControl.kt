package com.example.commandexample

import android.util.Log
import android.util.Log.e
import java.util.logging.Logger

class RemoteControl() {
    private var onCommands =  ArrayList<Command>()
    private var offCommands = ArrayList<Command>()
    private var undoCommand: Command
    private val COMMANDS_SIZE = 7

    init {
        var noCommand: Command = NoCommand()
        for (i in 0 until COMMANDS_SIZE) {
            onCommands.add(noCommand)
        }

        for(i in 0 until COMMANDS_SIZE) {
            offCommands.add(noCommand)
        }
        undoCommand = noCommand
    }

    fun setCommand(slot: Int, onCommand: Command, offCommand: Command){
        onCommands[slot] = onCommand
        offCommands[slot] = offCommand
    }

    fun onButtonWasPushed(slot: Int){
        onCommands[slot].execute()
        undoCommand = onCommands[slot]
    }

    fun offButtonWasPushed(slot: Int){
        offCommands[slot].execute()
        undoCommand = offCommands[slot]
    }

    fun undoButtonPushed(){
        undoCommand.undo()
    }

    override fun toString(): String{
        var sentence = StringBuffer()
        sentence.append("\n----Remote Control----\n")
        onCommands.let {
            for (i in 0 until onCommands.size){
                sentence.append("[slot $i]" + onCommands[i].javaClass.name + offCommands[i].javaClass.name + "\n" )
            }
        }
        return sentence.toString()
    }
}