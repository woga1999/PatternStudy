package com.example.stateexample

import java.lang.StringBuilder

class GumballMachine {
    var soldOutState: State = SoldOutState(this)
    var noQuarterState: State = NoQuarterState(this)
    var hasQuarterState: State = HasQuarterState(this)
    var soldState: State = SoldState(this)

    var count = 0
    private var state: State = soldOutState

    constructor(numberGumballs: Int){
        count = numberGumballs
        if (numberGumballs > 0){
            state = noQuarterState
        }
    }

    fun insertQuarter(){
        state.insertQuarter()
    }

    fun ejectQuarter(){
        state.ejectQuater()
    }

    fun turnCrank(){
        state.turnCrank()
        state.dispense()
    }

    fun setState(state: State){
        this.state = state
    }

    fun releaseBall(){
        println("A gumball comes rolling out the slot...")
        if(count != 0){
            count -= 1
        }
    }

    override fun toString(): String {
        var builder = StringBuilder()
        builder.append("주식회사 왕뽑기\n")
        builder.append("코틀린으로 돌아가는 2004년형 뽑기 기계\n")
        builder.append("남은 개수:$count\n")
        builder.append("동전 투입 대기중\n")
        return  builder.toString()
    }
}