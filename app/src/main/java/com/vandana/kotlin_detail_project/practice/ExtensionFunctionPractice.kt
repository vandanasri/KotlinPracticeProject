package com.vandana.kotlin_detail_project.practice

class ExtensionFunctionPractice {
    //type of util functions
    //Extension functions allow to add existing class without having access to its source code
    //The ability to extend the class with new functionality without having to inherit the property from the class.

    fun String.hasSpace() = find{it ==' '}!= null //Extension function

    //now use of extension function
    fun extensionExample(){
        val str = "Hello Extension Function"
        str.hasSpace()
    }


    class AquariumPlant(val color:String)
    fun AquariumPlant.isRed() = color ==
            "red"
    fun AquariumPlant?.pull() {
        this?.apply {
            println("removing $this")
        }
    }

    val AquariumPlant.isGreen: Boolean
        get() = color == "green"

}