package com.example.iteratorexample

class DinerMenu: Menu {
    private val MAX_ITEMS: Int = 6
    private val menuItems: Array<MenuItem>
    var numberOfItems = 0

    init {
        menuItems = Array(MAX_ITEMS) { MenuItem("", "", false, 0.0) }
        addItem("채식주의자용 BLT", "통밀 위에 (식물성) 베이컨, 상추, 토마토를 얹은 메뉴", true, 2.99)
        addItem("BLT", "통밀 위에 베이컨, 상추, 토마토를 얹은 메뉴", false, 2.99)
        addItem("BLT", "통밀 위에 베이컨, 상추, 토마토를 얹은 메뉴", false, 2.99)
        addItem("BLT", "통밀 위에 베이컨, 상추, 토마토를 얹은 메뉴", false, 2.99)
    }

    override fun createIterator(): Iterator {
        return DinerMenuIterator(menuItems)
    }

    fun addItem(name: String, desciption: String, vegetarian: Boolean, price: Double){
        val menuItem: MenuItem = MenuItem(name, desciption, vegetarian, price)
        if (numberOfItems >= MAX_ITEMS){
            println("죄송합니다. 준비한 메뉴가 꽉 찼습니다.")
        } else {
            menuItems[numberOfItems] = menuItem
            numberOfItems += 1
        }
    }
}