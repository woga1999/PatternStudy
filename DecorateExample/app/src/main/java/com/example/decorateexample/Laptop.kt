package com.example.decorateexample

abstract class Laptop {
    private val description = "This is Laptop abstract class" //헤드퍼스트 책속에는 추상클래스로 구현했는데 자바 인터페이스에서는 속성을 추가할 수 없어서 추상클래스를 사용한것같다.
    //인터페이스로 구현해도 가능하지만, 여기서 추상클래스를 써볼 생각이다.
    open fun getDescription(): String {
        return description
    }
    fun cost() {}
}