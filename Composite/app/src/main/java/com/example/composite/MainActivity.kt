package com.example.composite

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        initComponent()
    }

    private fun initComponent(){
        var pancakeHousMenu: MenuComponent = Menu("팬케이크 하우스 메뉴", "아침 메뉴")
        var dinerMenu: MenuComponent = Menu("객체마을 식당 메뉴", "점심 메뉴")
        var cafeMenu: MenuComponent = Menu("카페 메뉴", "저녁 메뉴")
        var dessertMenu: MenuComponent = Menu("디저트 메뉴", "디저트를 즐겨 보세요!")

        var allMenu: MenuComponent =  Menu("전체 메뉴", "전체 메뉴")
        allMenu.add(pancakeHousMenu)
        allMenu.add(dinerMenu)
        allMenu.add(cafeMenu)

        pancakeHousMenu.add(MenuItem("K&B 팬케이크 세트", "스크램블드 에그와 토스트가 곁들여진 팬케이크", true, 2.99))

        dinerMenu.add(MenuItem("파스타", "마리나라 소스 스파게티, 효모빵도 드립니다.", true, 3.89))

        dinerMenu.add(dessertMenu)
        dessertMenu.add(MenuItem("애플 파이", "바삭바삭한 크러스트에 바닐라 아이스크림이 얹혀 있는 애플 파이", true, 3.89))

        cafeMenu.add(MenuItem("베지 버거와 에어 프라이", "통밀빵, 상추, 토마토, 감자튀김이 첨가된 베지 커거", true, 3.99))
        cafeMenu.add(MenuItem("오늘의 스프", "샐러드가 곁들여진 오늘의 스프", false, 3.69))

        var waitress: Waitress = Waitress(allMenu)
        waitress.printMenu()
    }
}