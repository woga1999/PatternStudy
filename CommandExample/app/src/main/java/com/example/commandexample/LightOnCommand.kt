package com.example.commandexample

class LightOnCommand(var light: Light) : Command {

    override fun execute() {
        light.on()
    }

    override fun undo(){
        light.off()
    }

}