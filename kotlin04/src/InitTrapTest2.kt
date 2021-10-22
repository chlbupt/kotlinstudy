class Player7() {
    private val name: String
    private fun firstLetter() = name[0]

    init {
        println(firstLetter())
        name = "Jack"
        // println(firstLetter())
    }

}

fun main() {
    val p = Player7()
}

/**
 * 初始化陷阱二
 * 这段代码编译没有问题，因为编译器看到name属性已经在init块里初始化了，但代码一运行，就会排除空指针异常，因为name
 * 属性还没赋值，firstLetter函数就已经使用它了
 * */