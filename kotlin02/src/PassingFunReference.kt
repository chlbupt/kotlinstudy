fun main() {
    showOnBoard("竹叶青", ::getDiscountWords);
}

private fun getDiscountWords(goodsName: String, hour: Int): String{
    val currentYear = 2022
    return "${currentYear}年，双11${goodsName}促销倒计时：${hour} 小时"
}

private fun showOnBoard(goodsName: String, getDiscountWords: (String, Int) -> String){
    val hour = (1..24).shuffled().last()
    println(getDiscountWords(goodsName, hour))
}

/**
 * 函数引用
 * 要把函数作为参数传给其他函数使用，除了传lambda表达式，kotlin还提供了其他方法，传递函数引用
 * 函数引用可以把一个具名函数转换成一个值参，使用lambda表达式 的地方，都可以使用函数引用
 */