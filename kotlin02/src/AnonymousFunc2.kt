fun main() {
    val getDiscountWords = {goodsName:String, hour:Int ->
        val currentYear = 2021
        "${currentYear}年，双十一${goodsName}促销倒计时：$hour 小时"
    }
    println(showOnBoard("花生米", getDiscountWords))
}

private fun showOnBoard(goodsName: String, getDiscountWords: (String, Int) -> String){
    val hour = (1..24).shuffled().last()
    println(getDiscountWords(goodsName, hour))
}

