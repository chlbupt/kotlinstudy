class Player3(
    _name: String,
    var age: Int = 20,
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

    init {
        require(age > 0){ "age must be positive"}
        require(name.isNotBlank()){"player must have a name."}
    }
}

fun main() {
//    val p3 = Player3("Jack", isNormal = false)
//    println(p3.age)

//    var p4 = Player3("", isNormal=true)
    var p5 = Player3("xxx", isNormal=true)
}

/**
 * 默认参数
 * 定义构造函数时，可以给构造函数参数指定默认值，如果用户调用时不提供值参，就是用这个默认值
 * class Player3(
 *      _name: String,
 *      var age:Int = 20,
 *      private val isNormal:Boolean
 * ){
 *      var name = _name
 *          get() = field.capitalize()
 *          private set(value){
 *              field = value.trim()
 *          }
 * }
 * */


/**
 * 初始化块
 * 初始化块可以设置变量或值，以及执行有效性检查，如检查传给某构造函数的值是否有效
 * 初始化代码块会在构造类实例时执行
 *
 * 格式：init {}
 * */

