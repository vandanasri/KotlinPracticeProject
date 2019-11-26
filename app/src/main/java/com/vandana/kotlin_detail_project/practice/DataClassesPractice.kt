package com.vandana.kotlin_detail_project.practice

class DataClassesPractice {

    //classes which holds data are data classes

    data class Decorations(val rocks: String, val wood: String, val diver: String){}



    fun demo(){

    //to call data class
        val dataClassInstance1 = Decorations("crystal", "wood", "diver")

        val dataClassInstance2 = Decorations("crystal", "wood","ABC")


        //data class creates toString to print the properties
        print(dataClassInstance1)


        //to check properties are equal of two
        dataClassInstance1.equals(dataClassInstance2)

        //to copy one data property to another
        val dataClassInstance3:Decorations= dataClassInstance2.copy()


        //Decomposition
        val d = Decorations("crystal", "wood", "diver")
        val (rock, wood, diver) = d

    }



//    data class SpiceContainer(var spice: Spice) {
//        val label = spice.name
//    }
//    val spiceCabinet = listOf(SpiceContainer(Curry("Yellow Curry", "mild")),
//        SpiceContainer(Curry("Red Curry", "medium")),
//        SpiceContainer(Curry("Green Curry", "spicy")))
//
//    for(element in spiceCabinet) println(element.label)


}