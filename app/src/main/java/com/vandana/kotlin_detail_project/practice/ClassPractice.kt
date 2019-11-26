package com.vandana.kotlin_detail_project.practice


////Primary or default constructor
class ClassPractice(var height:Int =20, var width:Int =30) {

    //In Kotlin has four modifiers public -can be access anywhere, private- only that class but not subclass,
    //protected- only that class and subclass both, internal - only access by same module

    var area = height*width



    //Secondary constructor
    constructor(length:Int):this(){
        var area2 = height*width*height
    }

    constructor():this(20,8){
        var area2 = height*width*height
    }


    //init block- we can use init block to initialize values run before any secondary constructor

    init {
        print("Init block One")
    }

    //we can create more than one init block. It run from top to bottom and can be anywhere in the class
    // If we have to specify any property then we should write before init.
    init {
        print("Init block Two")
    }


    //for good kotlin code don't create too many constructor.
    //Just use primary constructor and init block and if required more than use helper function as given below
    fun helperFun()= ClassPractice(20,30)


    //Enum class
    enum class Color(val rgb: Int) {
        RED(0xFF0000),
        GREEN(0x00FF00),
        BLUE(0x0000FF);
    }
    //Color.RED
}