package com.example.commandexample

interface Command {
    open fun execute()
    open fun undo()
}