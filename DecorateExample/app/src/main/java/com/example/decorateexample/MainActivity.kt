package com.example.decorateexample

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val laptop = Apple("MacBook")
        println("랩탑 기본 설명 : " +laptop.description)
        println("랩탑 가격: " +laptop.cost().toString())

        val laptopWithAdapter = Adapter(laptop)
        println("랩탑에 어댑터 추가 설명 : " +laptopWithAdapter.showDescription())
        println("랩탑 어댑터 추가 가격 : " + laptopWithAdapter.cost().toString())

        val laptopWithAdapterAndKeyboard = Keyboard(laptopWithAdapter)
        println("랩탑 어댑터에 키보드까지 추가한 설명 : " + laptopWithAdapterAndKeyboard.showDescription())
        println("랩탑 어댑터에 키보드까지 추가한 가 : " + laptopWithAdapterAndKeyboard.cost().toString())

    }
}