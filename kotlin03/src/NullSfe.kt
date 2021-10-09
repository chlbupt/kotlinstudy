fun main() {
    var str: String? = "butterfly"
    str = ""
//    println(str?.capitalize())
    str = str?.let {
        if (it.isNotBlank()) {
            it.capitalize()
        } else {
            "bea"
        }
    }

    println(str)
}

/**
 * 在类型后面加？,表示可空
 * ?. 安全调用操作符,如果null，不执行
 */