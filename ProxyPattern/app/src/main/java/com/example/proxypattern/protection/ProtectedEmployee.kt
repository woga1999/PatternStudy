package com.example.proxypattern.protection

import com.example.proxypattern.protection.Employee
import com.example.proxypattern.protection.GRADE
import java.lang.RuntimeException

class ProtectedEmployee(employee: Employee): Employee {
    private var employee = employee
    override fun getName(): String {
        return employee.getName()
    }

    override fun getGrade(): GRADE {
        return employee.getGrade()
    }

    override fun getInformation(viewer: Employee): String {
        //본인 인사정보 조회
        if (employee.getGrade() == viewer.getGrade() && employee.getName().equals(viewer.getName())) {
            return employee.getInformation(viewer)
        }

        when(viewer.getGrade()){
            GRADE.VicePresident ->
                if (employee.getGrade() == GRADE.Manager || employee.getGrade() == GRADE.Staff){
                    return employee.getInformation(viewer)
                }
            GRADE.Manager ->
                if (employee.getGrade() == GRADE.Staff){
                    return employee.getInformation(viewer)
                }
            else ->
                throw NotAuthorizedException()
        }
        return ""
    }

    inner class NotAuthorizedException: RuntimeException(){

    }
}