/*class MagicBox<T>(item: T) {
    var available = false
    private var subject: T = item

    fun fetch(): T? {
        return subject.takeIf { available }
    }

    fun <R> fetch(subjectModFunction: (T) -> R): R? {
        return subjectModFunction(subject).takeIf { available }
    }
}

class Boy(val name: String, val age: Int)
class Dog(val weight: Int)

class Man(val name: String, val age: Int)

fun main() {
    val box1 = MagicBox(Boy("Jack", 20))
    val box2 = MagicBox(Dog(20))

    box1.available = true
    box1.fetch()?.run {
        println("you find $name")
    }

    val man = box1.fetch{
        Man(it.name, it.age.plus(10))
    }

    println(man)
}*/

/**
 * 定义泛型类
 * 泛型类的构造函数可以接受任何类型
 * MagicBox类指定的泛型参数由放在一对<>里的字母T表示，T是个代表item类型的占位符。
 * MagicBox类接受任何类型的item作为主构造函数值(item:T),并将item值赋给同样是T类型的subject私有属性
 * */