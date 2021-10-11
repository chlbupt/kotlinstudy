const val STR = "The people's republic of China"
fun main() {
    val r1 = STR.run {
        length >= 10
    }

    println(r1)

    val r2 = with(STR) {
        length >= 10
    }

    println(r2)
}