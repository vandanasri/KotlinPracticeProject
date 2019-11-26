package com.vandana.kotlin_detail_project.practice

class PairOrTripletPractice {

    //Pair is complete set of dataType which allow us to define generic pair of values.
    // Mostly used to return a set of values

    fun pairDemo() {
        val str = "value1" to "value2"
        print(str.first) //print value1


        val str2 = "value1" to "value2" to "value3" to "value4"
        print(str2)

        //to seperate them with parenthesis is called destructuring
        val str3 = ("value1" to "value2") to ("value3" to "value4")


        //through this we can assign different values to a variable
        val str4 = "value1" to "value2"
        val (one,two) = str4
        print("$one  and $two") //output: value1 and value2

        //we can change it into a string
        str4.toString()

        //into list
        str3.toList()


        // this is good to return more than one values from a function
        fun givePair():Pair<String,String>{
            return("value1" to "value2")
        }
        //then destructure it to get the values

        val (getOne, getTwq) = givePair()
        print(getOne)

    }



    //For triplet
    fun tripletDemo(){

        Triple("first", "second", "third")



        val (a, b, c) = Triple(2, "x", listOf(null))
        println(a) // 2
        println(b) // x
        println(c) // [null]
    }
}