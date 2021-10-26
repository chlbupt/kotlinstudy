/*fun String.addExt(amount: Int = 1) = this + "!".repeat(amount)
fun Any.easyPrint() = println(this)

fun main() {
    println("abc".addExt(2))

    "abc".easyPrint()
    15.easyPrint()
}*/

/**
 * 定义扩展函数
 * 扩展可以在不直接修改类定义的情况下增加类功能，扩展可以用于自定义类，也可以用于比如List、
 * String,以及kotlin标准库里的其他类。和继承相似，扩展也能共享类行为，在你无法接触某个类
 * 定义，或者某个类没有使用open修饰符，导致你无法继承它时，扩展就是增加类功能的最好选择。
 * */