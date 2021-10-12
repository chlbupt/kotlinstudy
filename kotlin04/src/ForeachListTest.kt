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
}