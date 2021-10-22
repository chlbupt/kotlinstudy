class Player5(_name: String) {
    var name = _name
    val config by lazy { loadConfig() }

    private fun loadConfig(): String {
        println("loading...")
        return "xxx"
    }
}

fun main() {
    var p = Player5("Jack")
    println(p.config)
}

/**
 * 惰性初始化
 * 延迟初始化并不是推后初始化的唯一方式，你也可以暂时不初始化某个变量，直到首次使用它。这个叫做惰性初始化
 * */