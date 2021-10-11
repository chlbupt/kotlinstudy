const val NAME = "Jimmy's friend"
const val NAMES = "jack,jacky,jason"

fun main() {
   /* val index = NAME.indexOf("'")
//    val sub = NAME.substring(0, index)
    val sub = NAME.substring(0 until index)
    println(sub)

    val list = NAMES.split(",")
    println(list)

    val (first, second, third) = NAMES.split(",")
    val format = String.format("first: %s, second: %s, third: %s", first, second, third)
    println(format)*/

    val str1 = "The people's Republic of China"
    val str2 = str1.replace(Regex("[aeiou]")){
        when(it.value){
            "a" -> "8"
            "e" -> "6"
            "i" -> "9"
            "o" -> "1"
            "u" -> "3"

            else -> it.value
        }
    }
    println(str1)
    println(str2)
}