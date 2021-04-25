package com.example.stateexample

class HasQuarterState(gumballMachine: GumballMachine): State {
    var gumballMachine = gumballMachine

    override fun insertQuarter() {
        println("동전을 한 개만 넣어주세요")
    }

    override fun ejectQuater() {
        println("동전이 반환됩니다.")
        gumballMachine.setState(gumballMachine.noQuarterState)
    }

    override fun turnCrank() {
        println("손잡이를 돌리셨습니다.")
        gumballMachine.setState(gumballMachine.soldState)
    }

    override fun dispense() {
        println("알맹이가 나갈 수 없습니다.")
    }
}