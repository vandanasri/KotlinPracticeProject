package com.vandana.kotlin_detail_project.practice

open public class InheritancePractice {

    //Any is the super class of all class just like object
    //By default class doesnot take part in inheritance, to do that we write open before class

    open var value :Int=12


}

//inheriting the class
class Test : InheritancePractice(){

    override var value:Int =20
}