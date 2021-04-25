package com.example.stateexample

class SoldOutState(gumballMachine: GumballMachine): State {
    var gumballMachine = gumballMachine

    override fun insertQuarter() {
        println("매진되었습니다. 다음 기회에 이용해주세요.")
    }

    override fun ejectQuater() {
        println("동전을 넣지 않으셨습니다. 동전이 반환되지 않습니다.")
    }

    override fun turnCrank() {
        println("매진되었습니다.")
    }

    override fun dispense() {
        println("매진입니다.")
    }
}