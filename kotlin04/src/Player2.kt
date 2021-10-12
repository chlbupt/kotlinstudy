class Player2(
    _name: String,
    var age: Int,
    var isNormal: Boolean
) {
    var name = _name
        get() = field.capitalize()
        set(value) {
            field = value.trim()
        }

    constructor(name: String) : this(name, age = 10, isNormal = false)

    constructor(name: String, age: Int) : this(name, age, isNormal = false) {
        this.name = name.toUpperCase()
    }
}

fun main() {
    var p = Player2("Jack", 20, true)

    val p2 = Player2("long")
    println(p2.name)
    println(p2.age)

    println("--------------------------")

    val p3 = Player2("Jacky", 20)
    println(p3.name)
}

/**
 * 在主构造函数里定义属性
 * kotlin允许你不使用临时变量赋值，而是直接用一个定义同时指定参数和类属性，通常，
 * 我们更喜欢用这种方式定义类属性，因为他会减少重复代码
 * */


/**
 * 次构造函数
 * 有主就有次，对应主构造函数的是次构造函数，我们可以定义多个次构造函数来配置不同的参数组合
 * 格式：construct(name: String) : this(name, age=100, isNormal=false)
 *
 * 使用次构造函数，定义初始化代码逻辑
 * 格式：constructor(name:String, age:Int) : this(name, age, isNormal=false){
 *      this.name = name.toUpperCase()
 * }
 * */
