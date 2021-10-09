fun main() {
    showOnBoard("老白干") { goodsName:String, hour:Int ->
        val currentYear = 2022
        "${currentYear}年，双十一${goodsName}促销倒计时：$hour 小时"
    }
}

private fun showOnBoard(goodsName: String, getDiscountWords: (String, Int) -> String){
    val hour = (1..24).shuffled().last()
    println(getDiscountWords(goodsName, hour))
}

/**
 * 简略写法
 * 如果一个函数的lambda参数排在最后，或者是唯一的参数，那么包括lambda值参的一对圆括号可以省略
 *
 */