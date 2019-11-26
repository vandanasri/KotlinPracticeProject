package com.vandana.kotlin_detail_project.practice

//library functions link: https://kotlinlang.org/api/latest/jvm/stdlib/index.html


class FunctionPractice{


 //In kotlin unit is same as void in java

 //this is main function
 fun main(args: Array<String>){

 }


 //Function with unit type.
 // if there is no return type then function is returning Unit
 fun demo(){

 }

 //Function return String
 fun stringDemo() :String{

  return ""
 }

 //Function has parameter
 fun paramDemo(str: String){


  //call below function three ways as given below
  defaultValueDemo(12)  //use default values

  defaultValueDemo(12,"slow")

  defaultValueDemo(12, "slow", 50)
 }


 //Function has default value
 fun defaultValueDemo(time:Int, speed :String ="fast", temp:Int = 50){

 }


 //compact function, declare fun as given below when ever have single expression in a body
 fun checkTemperature(temp: Int): Boolean = temp>50

 //or
 fun checkTemperatureVal(temp: Int)= temp>50

 //or
 fun getTemperature()=40





 //Standard library functions
 //repeat function
// repeat(5)
// {
//  print("Hello")
// }






//filter function
fun demoFilter(){
val decorations = listOf("balloons","flowers", "lightings", "lamps")

 val eager =decorations.filter { it[0] =='l' } //it will print only 'l' char words i.e. lightings lamps
 print(eager)


 //print the value in sequence
 val eagerSequence =decorations.asSequence().filter { it[0] =='l' }

 //lazy Sequence
 val eagerSequenceMap =decorations.asSequence().map { it[0] =='l' }

}


}