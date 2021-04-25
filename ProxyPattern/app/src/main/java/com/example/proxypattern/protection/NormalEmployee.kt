package com.example.proxypattern.protection

import com.example.proxypattern.protection.Employee
import com.example.proxypattern.protection.GRADE

class NormalEmployee(): Employee {
    //일반 구성원
    private lateinit var name: String
    private lateinit var grade: GRADE

    constructor(name: String, grade: GRADE): this(){
        this.name = name
        this.grade = grade
    }

    override fun getName(): String {
        return name
    }

    override fun getGrade(): GRADE {
        return grade
    }

    override fun getInformation(viewer: Employee): String {
        return "Display " + grade.name + " `" + name + "` personnel information."
    }
}