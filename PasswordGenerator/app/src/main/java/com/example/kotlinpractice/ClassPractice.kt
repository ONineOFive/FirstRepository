package com.example.kotlinpractice

open class Human (val name: String = "Anonymous"){

    constructor(name: String, age: Int): this(name){
        println("My name is ${name}, ${age}years old")
    }

    init{
        println("New human has been born!!")
    }

    fun eatingCake(){
        println("This is so YUMYYYYYYYYY~~~~")
    }

    open fun singASong(){
        println("lalala")
    }
}

class Korean: Human(){
    override fun singASong(){
        super.singASong()
        println("라라라")
    }
}


fun main(){
    val korean = Korean()
    korean.singASong()
//    val human = Human("minsu")
//
//    val stranger = Human()
//    human.eatingCake()
//
//    println("This human's name is ${human.name}")
//    println("This human's name is ${stranger.name}")
//
//    val mom = Human("Kuri", 52)
}