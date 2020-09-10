package com.vandana.kotlin_detail_project.practice

class ControlFlow {

    //if-else

    //when ===> instead of Switch

    //loops  ===> for, while, do-while

    private val temp =40

    //If-else Demo
    fun ifDemo()
    {

        //1
        if(temp>50)
            "found"
        else
            "not found"


        //2
       var newTemp = if(temp>50) "found" else "not found"  // you should always write an else part

        //3
        if(temp in 1..100) print(temp) else "not found"
    }



    /* when Demo */
    fun whenDemo(){

    var value:String? = null

        //1
        when(temp){
            0->value ="less than 50"
            50 ->value = "more than 50"
            else -> value = "perfect"
        }

        //2
     val msg =   when(temp){
                         0->"less than 50"
                        50 ->"more than 50"
                        else -> print("perfect")

                        }


        //3
        when(temp){
            in 0..40->"less than 50"   //in 0..40 range operator
            in 50..100 ->"more than 50"
            else -> print("perfect")
        }


        //4
        val sampleName = "Hello World"
        val splitString = sampleName.split(" ")

        val initials = when {
            splitString.size == 3 -> "${splitString.get(0).get(0)}${splitString.get(1).get(0)}${splitString.get(2).get(0)}"
            splitString.size == 2 -> "${splitString.get(0).get(0)}${splitString.get(1).get(0)}"
            else -> "Unknown"
        }

        println(initials)


        //5
        val sampleVarible: Any = 10.00

        val message = when(sampleVarible){
            is Float -> "This is a float data type"
            is Double -> "This is a double data type"
            is Int -> "This is a Int data type"
            is Long -> "This is a Long data type"
            else -> "Unhandled data type"
        }

        println(message)
    }




    fun forDemo() {
        //1
        for (i in 1..5) {
            print("$i \t")
        }


        //2
        for (i in 1..5 step 3) {
            print("$i \t")
        }


        //2
        for (i in 1.rangeTo(5)) {
            print("$i \t")
        }


        //3
        for (i in 5 downTo 1) {
            print("$i \t")
        }


        //4
        for (i in 5 downTo 1 step 2) {
            print("$i \t")
        }


        //5
        for (i in 1 until 10) {
            print("$i\t")
        }


        //6
        val sampleArray = arrayOf(34, 23, 54, 65, 67, 76)
        for (number in sampleArray) {
            print("$number\t")
        }


        //7
        for (i in sampleArray.indices) {
            println(sampleArray[i])
        }


        //8
        for ((index, value) in sampleArray.withIndex()) {
            println("$index -> $value")
        }


        //to break outer loop
        outerloop@for(i in 1..3){
            innerloop@for(j in 1..3) {
                if (j == 2) break@outerloop
                println("i: ${i}, j: ${j} \t")
            }
        }

        //return
        listOf(1,2,3,4,5,6).forEach sampl@{
            if(it==3) return@sampl     //it will skip only 3
            println(it)
        }
}
}