fun String.addExt(amount: Int = 1) = this + "!".repeat(amount)
fun <T> T.easyPrint(): T {
    println(this)
    return this
}

val String.numVowels
    get() = count { "aeiou".contains(it) }

fun main() {
//    "abc".easyPrint().addExt(2).easyPrint()
    "The people's Republic of China".numVowels.easyPrint()
}

/**
 *
 * 泛型扩展函数
 * 新的泛型扩展函数不仅可以支持任何类型的接收者，还保留了接收者的类型信息，使用泛型类型后，
 * 扩展函数能够支持更多类型的接收者，使用范围更广了。
 *
 * 扩展属性
 * 除了给类添加功能扩展函数外，你还可以给类定义扩展属性，给String类添加一个扩展，这个扩展属性
 * 可以统计字符串里有多少个元音字母。
 * */