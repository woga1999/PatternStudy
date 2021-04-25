package com.example.iteratorexample

class DinerMenuIterator(item: Array<MenuItem>): Iterator {
    var items: Array<MenuItem> = item
    var position: Int = 0

    override fun hasNext(): Boolean {
        if (position >= items.size || items[position] == null){
            return false
        }
        return true
    }

    override fun next(): Any {
        val menuItem: MenuItem = items[position]
        position += 1
        return menuItem
    }

    override fun remove(targetPosition: Int) {
        if (targetPosition >= items.size || targetPosition < 0 || items[targetPosition] == null){
            return
        }
        for (index in targetPosition until items.size){
            items[index] = items[index+1]
        }

    }

}