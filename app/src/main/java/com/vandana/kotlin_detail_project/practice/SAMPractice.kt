package com.vandana.kotlin_detail_project.practice

    //SAM acronym for Single Abstract Method. Runnable and callable are two examples
//SAM is basically an interface with one method un it

class SAMPractice {

    //to execute run method in java
//    public static void runNow(Runnable runnable){
//        runnable.run();
//    }


    //call runnable in kotlin
    fun rundemo() {
        val runnable = object :Runnable{
            override fun run() {
                print("I am runnable")
            }
        }

        //to call
        //JavaRun.runNow(runnable)
    }

    //So in kotlin we pass a Lambda in place of a SAM
    fun example(){
//        JavaRun.runNow{
//            print("I am passing a lambda as a runnable")
//        }
    }

}

interface Runnable {
    fun run()
}

interface Callable<T> {
    fun call(): T
}



