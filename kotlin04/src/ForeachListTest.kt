fun main() {
    val list = listOf<String>("Jason", "Jack", "Jacky")
    for (s in list) {
        println(s)
    }

    println("****************")

    list.forEach {
        println(it)
    }

    println("****************")

    list.forEachIndexed { index, item ->
        println("$index, $item")
    }

    println("****************")

    val (first, _, third) = listOf<String>("Jason", "Jack", "Jacky")
    println(first)

    println("****************")
}

/**
 * 元素遍历
 * for in
 * forEach
 * forEachIndexed
 *
 * 结构赋值过滤元素
 * 使用下划线_，过滤元素
 */