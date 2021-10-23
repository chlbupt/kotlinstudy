enum class Direction{
    EAST,
    WEST,
    SOUTH,
    NORTH
}

fun main() {
    println(Direction.EAST)
    println(Direction.EAST is Direction)
}

/**
 * 枚举类
 * 枚举类，用来定义常量集合的一种特殊类。
 * 枚举类也可以定义函数
 *
 * */