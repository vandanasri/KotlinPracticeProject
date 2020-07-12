package com.vandana.kotlin_detail_project.practice

class StringPractice {

    fun stringPractice(){

        //We can write string in multiple ways

        "Hello World"

        "Hello" + "World"

        val str1 = "Hello"
        val str2 = "World"

        print("My first program is $str1 $str2")

        print("My first program is ${str1 + str2}")


        //we can also write string template as given below
        val temp = 50
        val msg = "The temprature is ${ if(temp>50) "yes" else "no"} ."



        //boolean check
        str1 == str2 //return false

        str1 != str2 //return true



        //range check
        val fish =50
        if(fish in 1..100) print(fish) else "not found"

        //when statement
        when(fish){
            0->"empty tank"
            50 ->"full tank"
            else -> print("perfect")
        }

        when(fish){
             in 0..10->"empty tank"
            in 20..50 ->"full tank"
            else -> print("perfect")
        }






    }
}