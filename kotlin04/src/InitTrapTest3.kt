class Player8(_name: String) {
    val playerName:String = initPlayerName()
    val name:String = _name

    private fun initPlayerName() = name


}

fun main() {
    val p = Player8("LinKon")
    println(p.playerName)
}

/**
 * 初始化陷阱三
 *
 * */