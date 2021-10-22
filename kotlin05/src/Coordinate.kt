data class Coordinate(var x: Int, var y: Int) {
    val isInBounds = x > 0 && y > 0
}

fun main() {
    println(Coordinate(10,10))
    println(Coordinate(10,20) == Coordinate(10,20)) // true,重写了equals，比较的是对象的属性
}

/**
 * 数据类
 * 数据类，是专门设计用来存储数据的类
 * 数据类提供了toString的个性化实现
 * ==符号默认情况下，比较对象的的引用值，数据类提供了equals和hashCode的个性化实现
 *
 * copy
 * 除了重写Any类的部分函数，提供更好用的默认实现外，数据类还提供了一个函数，它可以用来方便的复制一个对象
 * 假设你想创建一个Student实例，除了name属性，它拥有和另一个Student实例完全一样的属性值，如果Student是个数据类
 * 那么复制现有Student实例就很简单了，只要调用copy函数，给想修改的属性传入值参就可以了
 * */