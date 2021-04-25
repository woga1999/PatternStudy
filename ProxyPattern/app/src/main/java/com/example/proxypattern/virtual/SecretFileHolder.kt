package com.example.proxypattern.virtual

object SecretFileHolder {
    //dummy
    open fun decodeByFileName(name: String) : String {
        try {
            Thread.sleep(300)
        } catch (e: InterruptedException){
            e.printStackTrace()
        }
        return name
    }
}