package com.vandana.kotlin_detail_project.practice

import java.lang.Math.random

class LamdaFunctions {

    //Lamda is an expression that makes a function
    //Instead of declaring a named function we declare a function that has no name
    //Lambda functions is an instance of Lambda Interface, which is itself a subType of Object.
    //for more see InlineClassesPractice

    // {print("Lamda Hello")}(), this of no use because we cn't call it. so

    var call = { print("Hello") } //use it as any other function like call()


    // Lamda called as just like named functions.
    var value = 10
    var namedFun = { value: Int -> value / 2 }

//Above example shows value :Int is Lamda arguments, value/2 Lamda body and -> function arrow
// so it takes the integer value and shows the result


    var namedFunVal: (Int) -> Int = { value -> value / 2 }

//Above example shows (Int) -> Int it takes the Int value and return the Int.
// So, don't have to specify any more in function argument


    fun updateFun(value: Int, operation: (Int) -> Int): Int {
        return operation(value)
    }

    val callFun = updateFun(value, namedFunVal) //calling lambda function


    //if the function is not a lambda and you have to pass it in lambda function then use :: double colon
    fun test(value: Int) = value + 10

    val values = updateFun(value, ::test) // use of duble colon


    // we don't have to write a function body in bracket in lambda
    val valuesCall = updateFun(value) { value ->
        values / 2
    }
    //show what exactly above function mean
    val valuesCalls = updateFun(value, { value -> values / 2 })


    val random1 = random()
    val ramdom2 = { random() }

    //random1 has a value assigned at compile time, and the value never changes when the variable is accessed.

    //random2 has a lambda assigned at compile time, and the lambda is executed every time the variable is referenced, returning a different value.


    data class Fish(val name: String)

    fun lamdaFilterDemo() {
        val myFish = listOf(Fish("Flipper"), Fish("Moby dick"), Fish("Dory"))
        myFish.filter { it.name.contains("i") }.joinToString("") { it.name }
        //output: Flipper Moby dick
        //joinToString is a library function
    }

    //to understand goto higer
    fun myWithFunction(argument:String,functionDefinition:String.()->Unit){
        argument.functionDefinition()
    }


    //Java lambdas can only access final variables.
    // Kotlin on the other hand supports access of non-final variables.
    // This case was briefly touched in another one of my articles.
    // Kotlin supports this feature by wrapping the variables in a reference and the lambda function captures this reference for it to use.
}