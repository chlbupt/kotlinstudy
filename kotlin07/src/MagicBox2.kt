class MagicBox2<T: Human>(item: T) {
    var available = false
    private var subject: T = item

    fun fetch(): T? {
        return subject.takeIf { available }
    }

    fun <R> fetch(subjectModFunction: (T) -> R): R? {
        return subjectModFunction(subject).takeIf { available }
    }
}

open class Human(val age: Int) // 父类
class Boy1(val name: String, age: Int): Human(age) // 继承，子类
class Man1(val name: String, age: Int): Human(age) // 继承，子类
class Dog1(val weight: Int)

fun main() {
    val box1 = MagicBox2(Boy1("Jack", 20))
//    val box2 = MagicBox2(Dog1(20)) // 编译不通过，类型不匹配

    box1.available = true
    box1.fetch()?.run {
        println("you find $name")
    }

    val man = box1.fetch {
        Man(it.name, it.age.plus(10))
    }

    println(man)
}

/**
 * 泛型类型约束
 * 如果要确保MagicBox里面只能装指定类型的物品，如Human类型，怎么办
 * */