fun main() {
    val list = listOf("Jason", "Jack", "Jacky")
//    println(list[3])
    // 安全取值函数
    println(list.getOrElse(3) { "Unknown" })
    println(list.getOrNull(3))
}

/**
 * list的创建
 * listOf("el1")
 */

