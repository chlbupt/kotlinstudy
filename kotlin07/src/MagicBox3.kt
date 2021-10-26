class MagicBox3<T : Human>(vararg item: T) { // item是个数组
    var available = false
    private var subject: Array<out T> = item

    fun fetch(index: Int): T? {
        return subject[index].takeIf { available }
    }

    fun <R> fetch(index: Int, subjectModFunction: (T) -> R): R? {
        return subjectModFunction(subject[index]).takeIf { available }
    }

    operator fun get(index: Int): T? = subject[index]?.takeIf { available }

}

open class Human1(val age: Int) // 父类
class Boy2(val name: String, age: Int) : Human(age) // 继承，子类
class Man2(val name: String, age: Int) : Human(age) // 继承，子类
class Dog2(val weight: Int)

fun main() {
    val box1 = MagicBox3(
        Boy1("Jack", 20),
        Boy1("Jacky", 16),
        Boy1("John", 26)
    )

    box1.available = true
    box1.fetch(1)?.run {
        println("you find $name")
    }

    println(box1[0])
}

/**
 * out
 * out(协变)，如果泛型类只将泛型类型作为函数的返回(输出)，那么使用out，可以称之为生产类/接口
 * 因为它主要是用来生产指定的泛型对象。
 *
 * in
 * in(逆变)，如果泛型类只将泛型类型作为函数的入参，那么使用in，可以称之为消费类或接口。
 * 因为它主要是用来消费指定的泛型对象。
 *
 * invariant(不变)
 * 如果泛型类即将泛型类型作为函数参数，又将泛型类作为函数的输出，那么既不用out也不用in。
 * */