import kotlin.math.roundToInt

fun main() {
//   val n1 = "8.98".toInt()
    val n1 = "8.98".toIntOrNull()
    println(n1)

    val n2 = 8.95678
    println(n2.toInt())
    println(n2.roundToInt())

    println("%.2f".format(n2))
}

/**
 * 数字类型的安全转换
 */