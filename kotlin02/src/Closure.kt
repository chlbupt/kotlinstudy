fun main() {
    val configDiscountWords = configDiscountWords()
    println(configDiscountWords("绿豆"))
}

fun configDiscountWords(): (String) -> String {
    val currentYear = 2021
    val hour = (1..24).shuffled().last()
    return { goodsName: String ->
        "${currentYear}年，双11${goodsName}促销倒计时：${hour}小时"
    }
}
/**
 * lambda作为函数 的返回值
 */

/**
 * 在kotlin中，匿名函数能修改并引用定义在自己的作用域之外的变量，匿名函数引用定义自身的函数里的变量，kotlin中的lambda就是闭包
 * 能接受函数或者返回函数的函数又叫高阶函数，高阶函数广泛应用于函数式编程当中
 */
