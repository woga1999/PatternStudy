package com.example.stateexample

class NoQuarterState(gumballMachine: GumballMachine): State {
    var gumballMachine = gumballMachine

    override fun insertQuarter() {
        println("동전을 넣으셨습니다.")
        gumballMachine.setState(gumballMachine.hasQuarterState)
    }

    override fun ejectQuater() {
        println("동전을 넣어주세요.")
    }

    override fun turnCrank() {
        println("동전을 넣어주세요.")
    }

    override fun dispense() {
        println("동전을 넣어주세요.")

    }
}