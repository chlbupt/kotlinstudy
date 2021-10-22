import java.io.File

open class Product(val name:String) {
    fun description() = "Product: $name"
    open fun load() = "Nothing..."
}

class LuxuryProduct: Product("Luxury"){
    override fun load() = "LuxuryProduct loading..."

    fun special() = "LuxuryProduct special function..."
}

fun main() {
    val l:Product = LuxuryProduct()
    println(l.load())

    println(l is Product)
    println(l is LuxuryProduct)

    if(l is LuxuryProduct){
        println((l as LuxuryProduct).special())
        // 智能类型转换
        println(l.special())
    }

    println("==============")

    println(l is Any)
}

/**
 * kotlin
 * kotlin默认类是封闭的，如果能被继承，使用open关键字
 * kotlin的属性，同样也需要open
 *
 * is
 * is可以用作类型判断
 *
 * as
 * as操作符声明，这是一个类型转换
 *
 * 智能类型转换
 * kotlin编译器很聪明，只要能确定any as 父类条件检查属实，它将会将any当作子类类型对待
 * 因此，编译器允许你不经类型转换直接使用
 *
 * any
 * 在java中，所有类的超类是object；在kotlin中，所有类的超类是Any
 * */