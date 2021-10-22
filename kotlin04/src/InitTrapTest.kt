class Player6(){
    private val blood = 100

    init {
        val bloodBonus = blood.times(4)
    }

//    val blood = 100
}

fun main() {

}

/**
 * 初始化陷阱一
 * 在使用初始化块时，顺序非常重要，你必须保证块中的所有属性已完成初始化
 * */