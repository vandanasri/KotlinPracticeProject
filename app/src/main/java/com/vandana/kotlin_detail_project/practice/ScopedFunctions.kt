package com.vandana.kotlin_detail_project.practice

class ScopedFunctions {

    //Difference between this and it
    //this refer to the context object as lambda receiver.
    //Ex- String.() -> Unit

    //it have context object as lambda argument.
    //Ex- String -> Unit




    //to initialize value
    //Context Object: this
    //return context object
    private val person = Person().apply {
        name = "Hello"
        age = 30
    }

    //to do some task with context object
    //Context Object: this
    //return lambda result
    val person1 = with(person){
        print(name)
        print(age)
    }



    //to perform some operation
    //Context Object: it
    //return context object
    val person2 = person.also {
        it.name = "New name"
        print(it.name)
    }


    //to avoid NullPointerException
    //Context Object: it
    //return lambda result

    val name: String? = "Hello"

    // Execute the lambda expression only if the 'name' variable is NOT NULL
    val stringLength = name?.let {
        println(it.reversed())
        println(it.capitalize())
        it.length       // Will be returned and stored within stringLength variable
    }


    /** Scope Function: 'run'
    Property 1: Refer to context object by using 'this'
    Property 2: The return value is the 'lambda result'  */

    // 'run' is combination of 'with' and 'let'
    // If you want to operate on a Nullable object and avoid NullPointerException then use 'run'

    private val person3: Person? = Person()

    val bio = person3?.run {
        println(name)
        println(age)
        age + 5
        "He is a freak who loves to teach in his own way"   // will be returned and stored in 'bio' variable
    }






}

class Person{
    var name = "Hello World"
    var age = 26
}