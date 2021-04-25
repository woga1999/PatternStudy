package com.example.iteratorexample

import java.text.FieldPosition
import java.util.*
import kotlin.collections.ArrayList

class PancakeHouseMenuIterator(item: ArrayList<MenuItem>): Iterator {
    var items: ArrayList<MenuItem> = item
    var position: Int = 0

    override fun hasNext(): Boolean {
        if (position >= items.size || items.get(position) == null){
            return false
        }
        return true
    }

    override fun next(): Any {
        val menuItem: MenuItem = items.get(position)
        position += 1
        return menuItem
    }

    override fun remove(targetPosition: Int){
        if (targetPosition >= items.size || targetPosition < 0 || items.get(targetPosition) == null){
            return
        }
        for (index in targetPosition until items.size){
            items[index] = items[index+1]
        }
        //items[items.size-1] = null
    }

}