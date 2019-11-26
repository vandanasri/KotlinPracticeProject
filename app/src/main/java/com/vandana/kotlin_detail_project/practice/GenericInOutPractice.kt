package com.vandana.kotlin_detail_project.practice


open class WaterSupply(var needsProcessed: Boolean)

//Out type are type parameters that only ever occur in return values of functions,
// or on val properties if we try to an out type as a parameter to a function, it will give us a compiler error
// out will ensure where a generic type used to
//In and out Type
class AquariumClass<out T: WaterSupply>(val waterSupply: T) {
}

fun addItemTo(aquarium: AquariumClass<WaterSupply>) = print("Item added")
fun genericExample(){
  //  val aquarium:AquariumClass<WaterSupply> = WaterSupply(needsProcessed = true)
    //    addItemTo(aquarium)
}


//Out type out from the function
//In type into a function

//In types can be used anytime the generic is only used as  an argument to functions

interface Cleaner<in T: WaterSupply> {
    fun clean(waterSupply: T)
}