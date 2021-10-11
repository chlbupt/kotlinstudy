fun main() {
    val list = mutableListOf("Jason", "Jack", "Jacky")
    list.add("Jimmy")
    list.remove("Jason")
    println(list)

    val toList = list.toList()

}

/**
 * 可变列表
 * 在kotlin中，支持内容修改的列表叫可变列表，要创建可变列表，可以使用mutableListOf函数
 * list还支持用toList和toMutableList函数动态实现只读列表和可变列表的相互转换
 */