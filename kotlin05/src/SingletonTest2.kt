open class Player{
    open fun load() = "loading nothing..."
}

fun main() {
    val p = object : Player(){
        override fun load() = "anonymous nothing.."
    }

    println(p.load())
}

/**
 * 对象表达式
 * 相当于匿名内部类
 * 有时候你不一定非要定义一个新的命名类不可，也许你需要某个现有类的一种变体实例，但只需要一次就行了
 * 事实上，对于这种用完就丢的类实例，连命名都可以省了。这个对象表达式是xx的子类，这个匿名类依然遵循
 * object关键字的一个规则，即一旦实例化，该匿名类只能有唯一一个实例存在。
 *
 * 伴生对象
 * 如果你想将某个对象的初始化和一个类实例捆绑在一起，可以使用伴生对象，使用companion修饰符，
 * 你可以在一个类定义里声明一个伴生对象，一个类里只能有一个伴生对象
 * */