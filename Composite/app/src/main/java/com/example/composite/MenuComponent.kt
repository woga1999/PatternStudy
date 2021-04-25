package com.example.composite

abstract class MenuComponent {
    open fun add(menuComponent: MenuComponent){
        throw java.lang.UnsupportedOperationException()
    }
    open fun remove(menuComponent: MenuComponent){
        throw java.lang.UnsupportedOperationException()
    }
    open fun getChild(i: Int): MenuComponent{
        throw java.lang.UnsupportedOperationException()
    }
    open fun getName(): String{
        throw java.lang.UnsupportedOperationException()
    }
    open fun getDescription(): String{
        throw java.lang.UnsupportedOperationException()
    }
    open fun getPrice(): Double{
        throw java.lang.UnsupportedOperationException()
    }
    open fun isVegetarian(): Boolean {
        throw java.lang.UnsupportedOperationException()
    }
    open fun print(){
        throw java.lang.UnsupportedOperationException()
    }
}