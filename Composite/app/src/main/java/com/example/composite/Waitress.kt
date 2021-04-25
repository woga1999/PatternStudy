package com.example.composite

class Waitress(allMenu: MenuComponent) {
    var allMenu: MenuComponent = allMenu

    fun printMenu(){
        allMenu.print()
    }
}