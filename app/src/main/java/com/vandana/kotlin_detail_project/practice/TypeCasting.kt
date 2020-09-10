package com.vandana.kotlin_detail_project.practice

class TypeCasting {

    var value = 10.0 // by default it is taking it as double, so to convert it as float we write value = 10.0f or typecast it as given below

    var num : Float= value as Float

    var numValue :Int = value as Int

    var newValue :Float = value.toFloat()



    //keyword :
    //var ===> mutable
    //val ====> immutable


    //Null Check

    //Null safety Check ?. Assign as null
    private var number:Int? = null

    //Elvis Operator ?: If value is not null then do else 0, Used with null safety.
    var elvisNum : Int = number?.toInt() ?: 0

    //Not Null Assertion Operator !!. It will through an exception
    var numb:Int = number!!.toInt()


    //Safe Casting
    val values: Float? = number as? Float


}