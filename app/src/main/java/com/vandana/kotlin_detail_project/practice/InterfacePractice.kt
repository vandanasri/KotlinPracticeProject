package com.vandana.kotlin_detail_project.practice



//abstract class do have constructors while interface don't have

interface InterfacePractice {

    fun add()
}

abstract class AbstractDemo{
    abstract var height: Int
    abstract var weight :Int
}

class Demo : AbstractDemo(), InterfacePractice {
    override var height: Int = 20
    override var weight: Int = 30

    override fun add() {
        var addition = height + weight
    }

    //to call class object, we don't use new keywords
    var inheritancePractice: InterfacePractice = TODO()


    // Singleton: to make one instance of the class we use keyword Object before class name and remove class keyword
    object DemoObject : InterfacePractice {
        override fun add() {
            10 + 20
        }

    }


    //Interface delegation
//    class Plecostomus (fishColor: FishColor = GoldColor):
//        FishAction by PrintingFishAction("eat a lot of algae"),
//       FishColor by fishColor

}