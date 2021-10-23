data class Coordinate2(var x: Int, var y: Int) {
    val isInBounds = x > 0 && y > 0

    operator fun plus(other: Coordinate2) = Coordinate2(x + other.x, y + other.y)
}

fun main() {
    val c1 = Coordinate2(10,20)
    val c2 = Coordinate2(10, 20)
    println(c1 + c2)
    
}

/**
 * 运算符重载
 * 如果将内置运算符应用在自定义类身上，你必须重写运算符函数，告诉编译器该如何操作自定义类
 *
 * 操作符      函数名         作用
 * +          plus              把一个对象添加到另一个对象里
 * +=         plusAssign        把一个对象添加到另一个对象里,然后将结果赋值给第一个对象
 * ==         equals            如果两个对象相等，则返回true，否则返回false
 * >          compareTo         如果左边的对象大于右边的对象，则返回true，否则返回false
 * []         get               返回集合中指定位置的元素
 * ..         rangeTo           创建一个range对象
 * in         contains          如果对象包含在集合里，则返回true
 * */
