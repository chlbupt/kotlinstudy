fun main() {
    var number: Int? = null

    try {
        checkOperation(number)
        number!!.plus(1)
    } catch (e: Exception) {
        println(e)
    }
}

fun checkOperation(number: Int?) {
//    number ?: throw UnskilledException()
    checkNotNull(number) { "Something is not good." }
}

class UnskilledException() : IllegalArgumentException("操作不当")

/**
 * 异常处理与自定义异常
 *
 * 先决条件函数
 * checkNotNull require requireNotNull
 * assert error
 */