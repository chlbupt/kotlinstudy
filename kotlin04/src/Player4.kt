class Player4 {
    private lateinit var equipment: String
    fun ready() {
        equipment = "sharp knife"
    }

    fun battle() {
        if (::equipment.isInitialized)
            println(equipment)
    }
}

fun main() {
    val p = Player4()
    p.ready()
    p.battle()
}

/**
 * 延迟初始化
 * 使用lateinit关键字相当于做了一个约定：在用它之前负责初始化
 * 只要无法确认lateinit变量是否完成初始化，可以执行isInitialized检查
 * */