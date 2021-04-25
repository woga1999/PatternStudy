package com.example.composite

class Menu(name: String, description: String): MenuComponent() {
    var menuComponents: ArrayList<MenuComponent> = ArrayList()
    private val name = name
    private val description = description

    override fun add(menuComponent: MenuComponent) {
        menuComponents.add(menuComponent)
    }

    override fun remove(menuComponent: MenuComponent) {
        menuComponents.remove(menuComponent)
    }

    override fun getChild(i: Int): MenuComponent {
        return menuComponents[i]
    }

    override fun getName(): String {
        return name
    }

    override fun getDescription(): String {
       return description
    }

    override fun print() {
        print("\n" + getName())
        println(", " + getDescription())
        println("-----------------------")
        menuComponents.forEach {
            it.print()
        }
    }
}