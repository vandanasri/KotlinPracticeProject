package com.vandana.kotlin_detail_project.practice

const val value = 5


//difference between val and const val is
//const val assign values at compile time whereas at val values assign at runtime or during program execution
// For const val cannot assign the return value from a function as its value, where as in val we can i.e.
fun test(){}
val result= test()

 // Const val will only work with top level and in class declared with object not with regular classes whereas its not so in val
const val CONSTANT = "top-level constant"
object Constants {
    const val CONSTANT2 = "object constant"
}
val foo = Constants.CONSTANT2


//Companion Constants

//Kotlin doesn't have a concept of class level constants.
// To define a constants into a class we have to wrap  them into companion object

class MyClass{
    companion object{
        const val CONSTANT3 ="companion object"
    }


    //Difference between companion object and regular object are
    //Companion object initialized from the static constructor of the containing class i.e they are created when the object is created
    // plain object are initialized lazily on the first access to that object, i.e. when they are first used

}


