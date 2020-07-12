package com.vandana.kotlin_detail_project.practice

import java.util.*
import kotlin.math.pow

class ArrayAndLoopPractice {

    //Array

    fun arrayPractice(){

        //create array
        val alphabet = arrayOf("A","B","C","D")

        //create typed array
        val number = intArrayOf(1, 2, 3, 4, 5)


        //we can save multiple type value into untyped array
        val mixArr = arrayOf("A","B", 1, 2)

        //and can covert it into String type as given below
        Arrays.toString(mixArr)


        //Nested Array
        arrayOf(alphabet, arrayOf("Hello"), mixArr)


        //Assigning of array
        val array =  Array(5)  {it * 2}
        println(array.asList())

        //output is [0,2,4,6,8]

    }



//Loop
    fun loopPractice(){

        val array = intArrayOf(10, 20, 30, 40, 50)

        //fetching the elements of an array
        for(element in array)
            print(element)

    //If you want to exclude the last value, use until:
    for (x in 0 until 10) println(x) // print till 0-9


    //array with indexes
    for (i in array.indices) {
        println(array[i])
    }
        //In for loop you can loop over the index along with the for loop
        for((index, element) in array.withIndex())
            println("Value at $index is $element")




        //range check Alphabet
        for(i in 'a'..'e')
            print(i) //output abcde

        //range check of numbers
        for(i in 1..5)
            print(i)  //output 12345

        //range check of numbers downwards
        for(i in 5 downTo 1)
            print(i)  //output 54321

        //range check of numbers
        for(i in 1..5 step 2)
            print(i)  //output 1 4






        //Example
        val arrayVal = Array(7){1000.0.pow(it)}

        val sizes = arrayOf("byte", "kilobyte", "megabyte", "gigabyte",
            "terabyte", "petabyte", "exabyte")

        for ((i, value) in arrayVal.withIndex()) {
            println("1 ${sizes[i]} = ${value.toLong()} bytes")
        }


        //output
//        1 byte = 1 bytes
//        1 kilobyte = 1000 bytes
//        1 megabyte = 1000000 bytes
//        1 gigabyte = 1000000000 bytes
//        1 terabyte = 1000000000000 bytes
//        1 petabyte = 1000000000000000 bytes
//        1 exabyte = 1000000000000000000 bytes

    }





    //Labeled Break: is a break of for loop. Helps in breaking nested loops.
    // It followed by the identifier with @ sign with it

    fun labels() {
        loop@ for (i in 1..100) { //it is the starting point of the loop
            for (j in 1..100) {
                if (i > 10) break@loop  //it stops if condition is true and restart from loop@
            }
        }
    }
}