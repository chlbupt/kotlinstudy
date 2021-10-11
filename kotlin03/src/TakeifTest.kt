import java.io.File

fun main() {
//    val readText = File("E://dream1.txt")
//        .takeIf { it.exists() && it.canRead() }
//        ?.readText()

    val readText = File("E://dream.txt")
        .takeUnless { it.isHidden }
        ?.readText()

    println(readText)
}

/**
 * takeif
 * 和其他标准函数有点不一样，takeif函数需要判断lambda中提供的条件表达式，给出true或false结果
 * 如果结果为true，从takeif函数返回接收者对象
 * 如果false，则返回null
 * 如果需要判断某个条件是否满足，再决定是否可以赋值变量或执行某项任务，takeif就非常有用
 * 从概念上讲，takeif函数类似于if语句，但它的优势是可以直接在对象实例上调用，避免了临时变量赋值的麻烦
 */

/**
 * takeUnless
 * takeif辅助函数takeUnless，只有判断你给定的条件结果是false时，takeUnless才会返回原始接收者对象
 */