package com.vandana.kotlin_detail_project.practice

class GenericFunctionPractice {

    //All generic types are only used in compile time in kotlin at rumtime it get erased.
    // But sometimes you need to some generic type like isCheck at runtime that is why kotlin added reified or real types

    fun <T: WaterSupply> isWaterClean(aquarium: GenericPractice.Aquarium<T>) {
        println("aquarium water is clean:${aquarium.waterSupply.needsProcessed}"
        )
    }
    fun genericsFunExample() {
        val aquarium = GenericPractice.Aquarium(GenericPractice.TapWater())
        //isWaterClean(aquarium)
    }

    //fun <R: WaterSupply> hasWaterSupplyOfType() = waterSupply is R

    //Java loses information of their generics at runTime. So to not to lose the information of the generic we use reified

//reified type/real type R: it checks whether the data is as real type or not in generic at compile time. Don't have to check explicitly

    //inline fun <reified R: WaterSupply> hasWaterSupplyOfType() = waterSupply is R
    inline fun <reified T: WaterSupply> WaterSupply.isOfType() = this is T

    //here say it take any generic typr no matter what generic type it is
    inline fun <reified R: WaterSupply> GenericPractice.Aquarium<*>.hasWaterSupplyOfType() = waterSupply is R



    // we cannot use generic type inside of a function.
    // So gson.fromJson(json, typeToken) internally it is of generic type.
    // Only way to set type as an argument then we use it as a function


}