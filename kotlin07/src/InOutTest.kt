interface Production<out T> {
    fun product(): T
}

interface Consumer<in T> {
    fun consume(item: T)
}

interface ProductionConsumer<T>{
    fun product(): T
    fun consume(item: T)
}

open class Food
open class FastFood: Food()
class Burger : FastFood()

// 生产者
class FoodStore: Production<Food>{
    override fun product(): Food {
        println("Produce food.")
        return Food()
    }
}

class FastFoodStore: Production<FastFood>{
    override fun product(): FastFood {
        println("Produce fastFood.")
        return FastFood()
    }
}

class BurgerStore: Production<Burger>{
    override fun product(): Burger {
        println("Produce Burger.")
        return Burger()
    }
}

// 消费者
class Everybody:Consumer<Food>{
    override fun consume(item: Food) {
        println("Eat food.")
    }
}

class ModernPeople:Consumer<FastFood>{
    override fun consume(item: FastFood) {
        println("Eat FastFood.")
    }
}

class American:Consumer<Burger>{
    override fun consume(item: Burger) {
        println("Eat Burger.")
    }
}


fun main() {
    val production1:Production<Food> = FoodStore()
    val production2:Production<Food> = FastFoodStore() // 子类泛型对象可以赋值给父类泛型对象，用out。

    val consume1: Consumer<Burger> = Everybody()
    val consume2: Consumer<Burger> = ModernPeople() // 父类泛型对象可以赋值给子类泛型对象，用in。
    consume2.consume(Burger()) // Eat FastFood.
}

/**
 * 为什么使用in&out
 * 父类泛型对象可以赋值给子类泛型对象，用in。
 * 子类泛型对象可以赋值给父类泛型对象，用out。
 * */