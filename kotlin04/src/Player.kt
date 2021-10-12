class Player {
    var name: String = "jack"
        get() = field.capitalize()
        set(value) {
            field = value.trim()
        }

    val rolledValue
        get() = (1..6).shuffled().first()
}

fun main() {
    val player = Player()
    println(player.name)
    player.name = "   rose   "
    println(player.name)

    println("========================")

    println(player.rolledValue)
}

/**
 * Field
 * 针对你定义的每一个属性，Kotlin都会产生一个field，一个getter、以及一个setter，field用来存储属性数据
 * 你不能直接定义field，kotlin会封装field，保护它里面的数据，只包鲁给setter和getter使用。
 * 属性的getter方法巨顶你如何读取属性值，每个属性都有getter方法，setter方法决定你如何给属性赋值，所以只有
 * 可变属性才会有setter方法，尽管kotlin会自动提供默认的getter和setter方法，但在需要控制如何读写属性数据时，
 * 你也可以自定义他们
 * */


/**
 * 计算属性
 * 计算属性是通过一个覆盖的get或set运算符来定义，这是field就不需要了
 * eg.
 *
 * */

/**
 * 防范竞态条件
 * 如果一个类属性即可空又可变，那么使用它之前你必须保证它非空，一个办法是用also标准函数
 *
 * eg.
 * class Player{
 *      var words:String? = "hello"
 *      fun saySomething(){
 *          words?.also{
 *              println("Hello ${it.toUpperCase()}")
 *          }
 *      }
 * }
 * */