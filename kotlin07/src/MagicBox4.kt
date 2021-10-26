class MagicBox<T : Human>() {
    inline fun <reified T> randomOrBackup(backup: () -> T): T { // 随机或者用匿名表达式产生一个T
        val items = listOf(
            Boy("Jack", 20),
            Man("John", 35)
        )

        val random = items.shuffled().first()
        return if (random is T) {
            random
        } else {
            backup()
        }
    }
}

open class Human0(val age: Int)
class Boy(val name: String, age: Int) : Human0(age){
    override fun toString(): String {
        return "Boy(name='$name', age=$age)"
    }
} // 继承，子类
class Man(val name: String, age: Int) : Human0(age){
    override fun toString(): String {
        return "Man(name='$name', age=$age)"
    }
} // 继承，子类

fun main() {
    val box1: MagicBox<Human> = MagicBox()
    val subject = box1.randomOrBackup {
        Man("Jimmy", 38)
    }

    println(subject)

}

/**
 * reified
 * 有时候，你可能想知道某个泛型参数具体是什么类型，reified关键字能帮你检查泛型参数类型。
 * kotlin不允许对泛型参数T做类型检查，因为泛型参数类型会被类型擦除，也就是说，T的类型信息
 * 在运行时是不可知的，java也有这样的规则。
 * */