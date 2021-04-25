package com.example.iteratorexample

class Waitress(pancakeHouseMenu: Menu, dinerMenu: Menu) {
    val pancakeHouseMenu = pancakeHouseMenu
    val dinerMenu = dinerMenu

    fun printMenu(){
        val pancakeIterator = pancakeHouseMenu.createIterator()
        val dinerIterator = dinerMenu.createIterator()
        println("메뉴\n-----\n아침 메뉴")
        printMenu(pancakeIterator)
        println("\n점심 메뉴")
        printMenu(dinerIterator)
    }

    fun printMenu(iterator: Iterator){
        while (iterator.hasNext()){
            val menuItem: MenuItem = iterator.next() as MenuItem
            print(menuItem.name + ", ")
            print(menuItem.price.toString() + " -- ")
            println(menuItem.description)
        }
    }
}