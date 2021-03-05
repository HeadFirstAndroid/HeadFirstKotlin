package me.yifeiyuan.hf.kotlin

/**
 * Created by 程序亦非猿 on 2021/3/5.
 */


fun main() {
    println("main")
    createMap()
}

fun createMap() {

    //mapOf 只是可读
    var intMap = mapOf<Int, Int>()
    var stringMap = mapOf<String, String>(
        "1" to "1", "2" to "2"
    )

    //mutableMapOf 可读可写
    var msMap = mutableMapOf<String, Int>("1" to 1, "2" to 2)
    //LinkedHashMap
    var linkedMap = linkedMapOf<String, String>()
    // HashMap
    var hashMap = hashMapOf<String, String>()


    println(msMap)

    msMap = (msMap - "1") as MutableMap<String, Int> //如果减法操作后为空 map 了，会变成一个 EmptyMap ，就会导致强转错误

    println(msMap)

}