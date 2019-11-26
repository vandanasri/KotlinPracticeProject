package com.vandana.kotlin_detail_project.practice

class CollectionsPractice {


//function for List
    fun listPractice(){

        //List are to two types mutable and immutable
        //immutable list
        val testList : List<Int> = listOf(12,13,18,2,9)
        testList.reversed()


        //mutable list
        val mutableList: MutableList<Int> = mutableListOf(14,15,67,98,6,2,45)
        mutableList.add(87)
        mutableList.add(0,6)
        mutableList.remove(67)

        mutableList.contains(98) //return true

        mutableList.subList(4,mutableList.size)


        //sum of list
        listOf<Int>(2,3,4).sum() //output: 9


        //SumBy : takes the lambda that specifies what property of the element to summarise
        //it is the default name for lambda argument
        listOf<String>("a","b","c","d").sumBy { it.length } //output:

    }

    fun reverseList(list: List<Int>) {
        val result: MutableList<Int> = mutableListOf<Int>()

        for (i: Int in 0..list.size - 1)
            result.add(list[list.size - i - 1])
    }


    //function for map
    fun mapPractice(){
        val mapValues:Map<String,String> = mapOf("key" to "A", "key2" to "B")
        //to get values
        mapValues.get("key")
        //or
        mapValues["key"]

        //if key is not found then default value get printed
        mapValues.getOrDefault("key3","c")
        //or
        mapValues.getOrElse("key3") {"c"}


        //mutable Map
        val mutableMapValue : MutableMap<String,String> = mutableMapOf("key" to "A", "key2" to "B")
        mutableMapValue.put("key3","c")
        mutableMapValue.remove("key2")
    }

}