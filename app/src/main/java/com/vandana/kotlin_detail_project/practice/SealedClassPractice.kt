package com.vandana.kotlin_detail_project.practice

//we have a class with a specific number of subclasses.
// What we get in the end is a concept very similar to an enum.
//Enum represents a group of constants .
// The difference is that in the enum we only have one object per type,
// while in the sealed classes we can have several objects of the same class.
//https://antonioleiva.com/sealed-classes-kotlin/


sealed class SealedClassPractice {


        class Add(val value: Int) : SealedClassPractice()
        class Substract(val value: Int) : SealedClassPractice()
        class Multiply(val value: Int) : SealedClassPractice()
        class Divide(val value: Int) : SealedClassPractice()

}

class DemoClass{

    fun execute(x: Int, op: SealedClassPractice) = when (op) {
        is SealedClassPractice.Add -> x + op.value
        is SealedClassPractice.Substract -> x - op.value
        is SealedClassPractice.Multiply -> x * op.value
        is SealedClassPractice.Divide -> x / op.value
    }
}