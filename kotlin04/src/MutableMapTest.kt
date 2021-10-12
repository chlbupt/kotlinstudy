fun main() {
    val mutableMap = mutableMapOf("Jack" to 20, "Jason" to 18, "Jack" to 30)
    mutableMap += "Long" to 15

    mutableMap.put("Jimmy", 18)

    mutableMap["Rose"] = 18

    // getOrPut() 如果存在就获取值，否则设置值
    val orPut = mutableMap.getOrPut("Juan") { 22 }
    println(orPut)

    println(mutableMap)
}