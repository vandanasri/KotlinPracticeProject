
//it can only be applied before package declaration, this is it's export name to jvm file
@file:JvmName("AnnotationsPractice")
package com.vandana.kotlin_detail_project.practice


//Annotations are means of attaching the meta-data  to code.
// It is read by the compiler and used to generate code and logic

//creation of simple annotation
annotation class ImUserAnnotation

//uses of my own annotation
@ImUserAnnotation
class AnnotationsPractice {
    companion object{
        @JvmStatic fun interop() {}
    }


    //to get all the annotation of a class
    fun getAllannotaionOfClass(){
        val plantObject = Plant::class
        for (a in plantObject.annotations) {
            println(a.annotationClass.simpleName)
        }
    }


    //annotations can target getters or setters
    @Target(AnnotationTarget.PROPERTY_GETTER)
    annotation class OnGet
    @Target(AnnotationTarget.PROPERTY_SETTER)
    annotation class OnSet


    class PlantTwo {
        @get:OnGet
        val isGrowing: Boolean = true
        @set:OnSet
        var needsFood: Boolean = false
    }

}


class Plant{
    fun trim(){}
    fun fertilize(){}
}


