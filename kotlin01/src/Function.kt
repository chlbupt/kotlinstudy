fun main() {
//    println(doSomething(11, false))
//    fix("Jack", 5)
    // 具名函数参数
//    fix(age=12, name="LuoJie")
    // Kotlin中没有返回值的函数叫Unit函数
//    println(fix(age=12, name="LuoJie"))

    // TODO()：抛出异常,返回Nothing类型
    TODO("nothing")
    println("after nothing...")
}


private fun doSomething(age: Int, flag: Boolean): String {
    return "hello"
}

fun fix(name: String, age: Int = 2) {
    println(name + age)
}