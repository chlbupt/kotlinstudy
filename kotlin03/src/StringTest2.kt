fun main() {
    val str1 = "Jason"
    val str2 = "jason".capitalize()
    println(str1 == str2) // true，比较内容
    println(str1 === str2) // true，比较引用

    "The people's Republic of China".forEach {
        print("$it * ")
    }
}