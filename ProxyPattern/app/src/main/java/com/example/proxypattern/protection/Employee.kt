package com.example.proxypattern.protection

interface Employee {
    fun getName(): String
    fun getGrade(): GRADE
    //구성원의 인사정보(매개변수는 조회자)
    fun getInformation(viewer: Employee): String
}