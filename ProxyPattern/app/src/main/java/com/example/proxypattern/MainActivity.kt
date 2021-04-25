package com.example.proxypattern

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.proxypattern.protection.ProtectedEmployee.NotAuthorizedException
import com.example.proxypattern.protection.Employee
import com.example.proxypattern.protection.GRADE
import com.example.proxypattern.protection.NormalEmployee
import com.example.proxypattern.protection.ProtectedEmployee
import com.example.proxypattern.virtual.TextFile
import com.example.proxypattern.virtual.TextFileProvider
import java.util.*
import java.util.stream.Collectors
import kotlin.collections.ArrayList


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //가상 프록시
        //실제 객체의 사용 시점을 제어
        //늦은 초기화를 프록시를 사용해 구현
        //인터페이스: TextFile
        //나는 보안ㄴ 전자 서류 전문 업체에 근무하고 있는 개발자, 콘솔 프로그램으로 20개씩 난독화된 전자 서류의 본문을 복호화해서 보여주는 프로그램 작성을 할 건데 이를 어떻게 할 건가?
        println("================================================================")
        println("Virtual Proxy Test")
        println("================================================================")
        virtualTestMain()


        println("================================================================")
        println("================================================================")
        println("================================================================")
        println("Protection Proxy Test")
        println("================================================================")

        //보호 프록시
        protectionProxyMain()
    }

    fun virtualTestMain(){
        var textFileList = ArrayList<TextFile>()

        //처음 3개 파일만 실제 객체 사용
        textFileList.addAll(TextFileProvider.getSecretTextFile(0,3))
        //나머지는 프록시 객체를 사용해 프로그램에서 첫 결과가 나오는 것을 1초 내
        textFileList.addAll(TextFileProvider.getProxyTextFile(3,20))

        textFileList.map (TextFile::fetch).forEach(System.out::println)
    }

    fun protectionProxyMain() {
        // 직원별 개인 객체 생성
        val CTO: Employee = NormalEmployee("Dragon Jung", GRADE.VicePresident)
        val CFO: Employee = NormalEmployee("Money Lee", GRADE.VicePresident)
        val devManager: Employee = NormalEmployee("Cats Chang", GRADE.Manager)
        val financeManager: Employee = NormalEmployee("Dell Choi", GRADE.Manager)
        val devStaff: Employee = NormalEmployee("Dark Kim", GRADE.Staff)
        val financeStaff: Employee = NormalEmployee("Pal Yoo", GRADE.Staff)

        // 직원들을 리스트로 가공.
        val employees: List<Employee> = Arrays.asList(CTO, CFO, devManager, financeManager, devStaff, financeStaff)
        println("================================================================")
        println("시나리오1. Staff(Dark Kim)가 회사 인원 인사 정보 조회")
        println("================================================================")

        // 자신의 직급에 관계 없이 모든 직급의 인사 정보를 열람 (문제!!)
        printAllInformationInCompany(devStaff, employees)
        println("================================================================")
        println("보호 프록시 서비스를 가동.")
        println("================================================================")
        val protectedEmployees: List<Employee> = employees.asSequence().map { employee: Employee? -> ProtectedEmployee(employee!!) }.toList()
        println("================================================================")
        println("시나리오2. Staff(Dark Kim)가 회사 인원 인사 정보 조회")
        println("================================================================")
        printAllInformationInCompany(devStaff, protectedEmployees)
        println("================================================================")
        println("시나리오3. Manger(Cats Chang)가 회사 인원 인사 정보 조회")
        println("================================================================")
        printAllInformationInCompany(devManager, protectedEmployees)
        println("================================================================")
        println("시나리오4. VicePresident(Dragon Jung)가 회사 인원 인사 정보 조회")
        println("================================================================")
        printAllInformationInCompany(CTO, protectedEmployees)
    }

    fun printAllInformationInCompany(viewer: Employee?, employees: List<Employee>) {
        employees.asSequence()
                .map { employee: Employee ->
                    try {
                        return@map employee.getInformation(viewer!!)
                    } catch (e: NotAuthorizedException) {
                        return@map "Not authorized."
                    }
                }
                .forEach { s: String? -> println(s) }
    }
}