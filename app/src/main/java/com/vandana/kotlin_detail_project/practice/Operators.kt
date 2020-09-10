package com.vandana.kotlin_detail_project.practice

import android.os.Build
import androidx.annotation.RequiresApi
import androidx.core.graphics.toColor

class Operators {

    @RequiresApi(Build.VERSION_CODES.O)
    fun operatorsPractice() {

        //operators provide automatically
        val fish = 5
        fish.div(10)


        //use primitive input as an objects
        1.toLong()
        3.toColor()




        //non-changeable variables, can't be reassigned. It hold the reference of the value.
        val cup = 5

        val myList = mutableListOf("A", "B", "C")

        //myList = mutableListOf("A", "B") will give an error as do not assign different list but if we do as given below will not

        myList.remove("c") //now it's fine. We can change mutable list as it holds reference not values




        //changeable variables
        var cup2 = 6
        cup2 = 8



        //type casting
        val c: Byte = 8
        val b: Int = c.toInt()



        //checking for null, can't assign null values.
        // So to avoid it here are some conditions to follow

        //called Safe check. It ignores if data is null
        var valu = null
        var value: Int? = null
        var listValues: List<String?> = listOf(null, null)
        var listValue: List<String>? = null
        var listVal: List<String?>? = null
        listVal = listOf(null, null)


        //called Null Exertion. It throws Null pointer exception if data is null
        //It is bad idea to use null with exception thus it has double !! mark to double check.
        var chkValue: Int
        //chkValue!!.setText()




        //check null condition in if statement. save lots of time.
        // It's call the ?: alvis operator as it has the smily on its side

        val condition = 9

        condition?.dec() ?: 0
    }
}