package com.vandana.kotlin_detail_project.practice

//link: https://kotlinlang.org/docs/reference/lambdas.html


data class Fish(var name:String)


class HigherOrderFuncionsPractice {

    fun fishTest(){
    val fish = Fish("gold fish")

        //with fish name call capitalize. WITH IS A HIGHER ORDER FUNCTION
        with(fish.name){
            capitalize()
        }

        //call of myWithFunction. Written atLast
        myWithFunction(fish.name){
            capitalize()  //It will return the copy of String not original string
            //output: Gold Fish
        }
        //run is extension that run with all dataTypes. It takes one lambda as an argument
        // and give the result the accordingly
        print(fish.run { name })  //return the fish name


        //apply is similar to run and can be used in all dataTypes but it will return the object not argument
        //It is useful for functions on newly created objects
        print(fish.apply {  })

        //output: Fish(name=splashy)
        //Gold Fish
        val fish2:Fish = Fish("Splashy").apply {name= "Gold Fish" }
        print(fish2.name)


        //Let returns the copy of the changed object.
        // It is useful for chaining manipulations together
        fish.let{it.name.capitalize( )}
            .let{it+"fish"}
            .let{it.length}
            .let{it+31}
    }


    //create my own with function
    //after function definition we need to write the class we are extending,
    // Let say String class we are extending. After that specify the return type of the function argument
    //So in myWith function functionDefinition is now extension function on a string object and we can apply it to a String
    fun myWithFunction(argument:String,functionDefinition:String.()->Unit){
        argument.functionDefinition()
    }






}


