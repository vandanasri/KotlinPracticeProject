package com.vandana.kotlin_detail_project.practice


//https://www.geeksforgeeks.org/inline-functions-cpp/
//https://kotlinlang.org/docs/reference/inline-classes.html
//https://www.geeksforgeeks.org/kotlin-inline-functions/


class InlineClassesPractice {

    data class Fish(var name:String)

    val fish = Fish("gold fish")
    fun inLinePracticeFun(){

        myWithFunction(fish.name){
            capitalize()
        }

        //There is problem with the above code whenever capitalize is called it will create a new lambda object
        //Lambda functions is an instance of Lambda Interface, which is itself a subType of Object
        //i.e. as given below
        myWithFunction(fish.name, object:Function1<String,Unit>{
            override fun invoke(name:String){
                name.capitalize()
            }
        })


        //So to fix this problem kotlin has used inline.
        //The compiler will change the code to replace the lambda with the instructions inside the lambda
    // On call of the inline the call of the lambda get replaced with the content of the function body of the lambda

        // so inline function call as
        fish.name.capitalize()

        //Inline are large functions does increase your code size so use it for small functions

    }

    //To learn more goto HigherOrderFuncionsPractice
    inline fun myWithFunction(argument:String,functionDefinition:String.()->Unit){
        argument.functionDefinition()
    }
}

