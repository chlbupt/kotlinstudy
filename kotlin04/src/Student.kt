class Student(
    _name: String,
    val age: Int
) {
    var name = _name
    var score = 10
    private val hobby = "music"
    var subject: String

    init {
        println("init...")
        subject = "math"
    }

    constructor(_name: String) : this(_name, 10){
        println("construct...")
        score = 20
    }

}

fun main() {
    val s1 = Student("Jack")

}

/**
 * 初始化顺序
 * 主构造函数里声明的属性
 * 类级别的属性赋值
 * init初始化快里的属性赋值和和函数调用
 * 次构造函数里的属性赋值和函数调用
 * */