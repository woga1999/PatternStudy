package com.example.commandexample

class StereoOnWithCDCommand(var stereo: Stereo): Command {
    override fun execute() {
        stereo.on()
        stereo.setCD()
        stereo.setVolume(11)
    }
    override fun undo(){
        stereo.off()
    }
}