class Player2 {
    class Equipment(var name: String) {
        fun show() = println("equipment: $name")
    }

    fun battle(){

    }
}


fun main() {
    Player2.Equipment("sharp knife").show()
}

/**
 * 嵌套类
 * 如果一个类只对另一个类有用，那么将其嵌入到该类并使两个类保持在一起是合乎逻辑的，可以使用嵌套类
 * */