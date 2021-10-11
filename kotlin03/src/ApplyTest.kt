import java.io.File

fun main() {
    val f1= File("E://test.txt")
    f1.setReadable(true)
    f1.setWritable(true)
    f1.setExecutable(false)

    // apply的使用
    // 上下效果是一样的，第二种更简洁
    val f2 = File("E://test.txt").apply {
        setReadable(true)
        setWritable(true)
        setExecutable(false)
    }

}

/**
 * apply
 * apply函数可以看做一个配置函数，你可以传入一个接受者，然后调用一系列函数来配置它以便使用
 * 如果提供lambda给apply函数执行，它会返回配置好的接受者
 */

/**
 * let函数能使某个变量作用于其lambda表达式里，让it关键字能引用它。let与apply比较，let会把接收者传给lambda，而apply什么也不传，匿名函数执行完，apply会返回
 * 当前接收者，而let会返回lambda的最后一行
 */