import java.io.File

open class ConfigMap{
    companion object{
        private  const val PATH="XXX"
        fun load() = File(PATH).readBytes()
    }
}

fun main() {
    // 类似static的用法，静态函数
    ConfigMap.load()
}

/**
 * 伴生对象
 * 如果你想将某个对象的初始化和一个类实例捆绑在一起，可以使用伴生对象，使用companion修饰符，
 * 你可以在一个类定义里声明一个伴生对象，一个类里只能有一个伴生对象
 * */