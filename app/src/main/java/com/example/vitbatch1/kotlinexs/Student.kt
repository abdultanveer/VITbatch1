package com.example.vitbatch1.kotlinexs

/**
 * POJO - plain old java object / VO value object / model class -- box with partitionns
 */
class Student(var name: String, var age: Int, var postalAddress: String){
    fun calculateEligibility(){
        println("you're eligible")
    }
}
