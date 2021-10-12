fun main() {
//    val set = setOf<String>("Jason", "Jack", "Jacky", "Jack")
////    println(set.elementAt(2))

    /*val mutableSet = mutableSetOf<String>(
        "Jason",
        "Jack",
        "Jacky",
        "Jack"
    )

    mutableSet.add("Jimmy")
    mutableSet.remove("Jack")

    mutableSet -= "Jacky"
    mutableSet += "long"
    println(mutableSet)
    */

    // List利用集合去重
    /*val toSet = listOf<String>("Jason", "Jack", "Jacky", "Jack").toSet().toList()
    println(toSet)*/

    // list还可以通过distinct函数去重
    val list = listOf<String>("Jason", "Jack", "Jacky", "Jack").distinct()
    println(list)

}