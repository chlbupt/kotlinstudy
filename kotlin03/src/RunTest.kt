import java.io.File

fun main() {
    val file = File("E://dream.txt")
    val result = file.run {
        readText().contains("great")
        "xxx"
    }

    println(result)

    "The people's republic of China"
        .run(::isLong)
        .run(::showMessage)
        .run(::println)

}

fun isLong(name: String) = name.length >= 10

fun showMessage(isLong: Boolean):String {
    return if (isLong) {
        "Name is  too long"
    } else {
        "please rename."
    }
}

/**
 * with
 * with函数是run的变体，他们的功能行为是一样的，但with的调用方式不同，调用with时需要值参作为其第一个参数传入
 */