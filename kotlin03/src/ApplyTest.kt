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