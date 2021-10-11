fun main() {
    val result = listOf(3, 2, 1).first().let {
        it * it
    }
    println(result)

    val greeting = formatGreeting(null)
    println(greeting)
}

fun formatGreeting(guestName: String?): String {
    return guestName?.let {
        "Welcome, $it"
    } ?: "What's your name";
}

/**
 * run
 * 光看作用域行为，run和apply差不多，但与apply不同，ryn函数不反悔接收者，run返回的是lambda结果， 也就是true和false
 */