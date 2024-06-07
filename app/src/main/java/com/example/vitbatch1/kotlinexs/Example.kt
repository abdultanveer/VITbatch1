package com.example.vitbatch1.kotlinexs

fun main() {
    println("hello world");
    var myStudent: Student = Student("abdul",123,"bangalore")
    println(myStudent.name)
    myStudent.name = "ansari"
    println(myStudent.name)

    var myEmployee: Employee = Employee("tanveer",222,"chennai")
    println(myEmployee.getName())
    println(myEmployee.name)

}