fun main() {
    val map = mapOf("Jack" to 20, "Jason" to 18, "Jack" to 30)
    /*println(map)

    val map1 = mapOf<String, Int>(Pair("Jimmy", 20), Pair("Jacky", 10))
    println(map1)*/

    println(map["Jack"])
    println(map.getValue("Jack"))
    println(map.getOrElse("Rose") { "Unknown" })
    println(map.getOrDefault("Long", "Long"))

    println("*************************")

    map.forEach {
        println("${it.key}, ${it.value}")
    }

    println("*************************")
    map.forEach { (key: String, value: Int) ->
        println("$key, $value")
    }
}

/**
 * 读取map的值
 * []取值运算符,读取相应的值，如果键不存在，就返回null
 * getValue，去读键对应的值，如果键不存在就抛出异常
 * getOrElse，读取键相应的值，或者使用匿名函数返回默认值
 * getOrDefault,读取键相应的值，或者返回默认值
 *
 * */