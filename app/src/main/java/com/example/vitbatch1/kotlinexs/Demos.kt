package com.example.vitbatch1.kotlinexs

fun main() {
    val s = Square(10)

    var name:String = "abdul"
    println(name.commaSeperated("some other string"))

    for (i in 1..5) print(i)

    printHello("hello")
    drive("slow")  //slow = argument

    tempToday("mon",32)
    add(10,20,'+')
    add(operation = '*', secondNo = 20, firstNo = 10)
}

fun double(x: Int) = x * 2


fun add(firstNo:Int, secondNo:Int, operation:Char): Int {
    return firstNo + secondNo
}

fun printHello(name: String?) {
    println("Hi there!")
}

fun drive(speed: String = "fast") {   //speed = param
    println("driving $speed")
}

fun tempToday(day: String, temp: Int) {
    println("Today is $day and it's $temp degrees.")
}

fun String.commaSeperated( values:String):String{
  return  "comma seperated string --"+ values

}

class Square(val side: Int) {
    init {
        println(side * 2)
    }
}
