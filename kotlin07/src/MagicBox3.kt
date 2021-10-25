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
 *
 * */