data class Student(
    var name: String,
    val age: Int
) {
    private val hobby = "music"
    private val subject: String
    var score = 0

    init {
        println("init...")
        subject = "math"
    }

    constructor(_name: String) : this(_name, 10) {
        score = 10
    }

    override fun toString(): String {
        return "Student(name='$name', age=$age, hobby='$hobby', subject='$subject', score=$score)"
    }

}

fun main() {
    val s = Student("Jack")
    val copy = s.copy(name = "Rose")
    println(s)
    println(copy)
}

/**
 * copy
 * 除了重写Any类的部分函数，提供更好用的默认实现外，数据类还提供了一个函数，它可以用来方便的复制一个对象
 * 假设你想创建一个Student实例，除了name属性，它拥有和另一个Student实例完全一样的属性值，如果Student是个数据类
 * 那么复制现有Student实例就很简单了，只要调用copy函数，给想修改的属性传入值参就可以了
 *
 * copy中有个坑
 * copy时，如果次构造函数也进行赋值，那么次构造函数的赋值不起作用。需要手动赋值
 * */