package com.example.iteratorexample

class PancakeHouseMenu: Menu {
    var menuItems: ArrayList<MenuItem> = ArrayList()

    init {
        addItem("K&B 팬케이크 세트", "스크램블드 에그와 토스트가 곁들여진 팬케이크", true, 2.99)
        addItem("레귤러 팬케이크 세트", "달걀 후라이와 소시지가 곁들여진 팬케이크", false, 2.99)
        addItem("블루베리 팬케이크 세트", "신선한 블루베리와 블루베리 시럽으로 만든 팬케이크", true, 3.49)
        addItem("와플", "와플, 취향에 따라 딸기나 블루베리를 얹을 수 있습니다.", true, 3.59)
    }

    override fun createIterator(): Iterator {
        return PancakeHouseMenuIterator(menuItems)
    }

    fun addItem(name: String, desciption: String, vegetarian: Boolean, price: Double){
        val menuItem: MenuItem = MenuItem(name, desciption, vegetarian, price)
        menuItems.add(menuItem)
    }
}