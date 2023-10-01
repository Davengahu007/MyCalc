package com.example.calculator

class Calculator {
}
fun main() {
    while (true) {
        println("Enter the operation you want to perform (add, subtract, multiply, divide) or 'exit' to quit:")
        val operation = readLine() ?: ""

        if (operation == "exit") {
            println("Exiting calculator. Goodbye!")
            break
        }

        println("Enter the first number:")
        val num1 = readLine()?.toDoubleOrNull()
        if (num1 == null) {
            println("Invalid number.")
            continue
        }

        println("Enter the second number:")
        val num2 = readLine()?.toDoubleOrNull()
        if (num2 == null) {
            println("Invalid number.")
            continue
        }

        val result = when (operation) {
            "add" -> num1 + num2
            "subtract" -> num1 - num2
            "multiply" -> num1 * num2
            "divide" -> {
                if (num2 == 0.0) {
                    println("Cannot divide by zero.")
                    continue
                }
                num1 / num2
            }
            else -> {
                println("Invalid operation.")
                continue
            }
        }

        println("Result: $result")
        println("----------")
    }
}
