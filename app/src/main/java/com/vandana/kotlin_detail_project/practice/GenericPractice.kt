package com.vandana.kotlin_detail_project.practice

class GenericPractice {

    //Generics are the powerful features that allow us to define classes, methods and properties
    // which are accessible using different data types while keeping a check of the compile-time type safety.

    open class WaterSupply(var needsProcessed: Boolean)


    class TapWater : WaterSupply(true) {
        fun addChemicalCleaners() {
            needsProcessed = false
        }

        fun addChemicalCleanes() {}
    }

    class FishStoreWater : WaterSupply(false)
    class LakeWater : WaterSupply(true) {
        fun filter() { needsProcessed = false }
    }

    class Aquarium<T>(val waterSupply: T)
    fun genericsExample() {
        val aquarium = Aquarium(TapWater())
        aquarium.waterSupply.addChemicalCleanes()
    }

    //Non-nullable:
    //class Aquarium<T: Any>(val waterSupply: T)
    //class Aquarium<T: WaterSupply>(val waterSupply: T)



    //code without generic class
    class Company (text: String) {
        var x = text
        init{
            println(x)
        }
    }

    fun main(args: Array<String>){
        var name: Company = Company("GeeksforGeeks")
       // var rank: Company = Company(12)// compile time error
    }


    //code with generic class
    class CompanyGe<T> (text : T){
        var x = text
        init{
            println(x)
        }
    }
    fun abc(){
        var name: CompanyGe<String> = CompanyGe<String>("GeeksforGeeks")
        var rank: CompanyGe<Int> = CompanyGe<Int>(12)
    }



}