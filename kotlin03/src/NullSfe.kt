fun main() {
    var str: String? = "butterfly"
    str = ""
//    println(str?.capitalize())
    str = str?.let {
        if (it.isNotBlank()) {
            it.capitalize()
        } else {
            "bea"
        }
    }

    str = null
//    str = str!!.capitalize();

    println(str ?: "lulu")
}

/**
 * 在类型后面加？,表示可空
 * ?. 安全调用操作符,如果null，不执行
 * !!. 非空断言操作符
 * 我们也可以使用if判断，但是相比之下安全调用操作符使用起来更灵活，代码也更简洁，我们可以用安全操作符进行多个函数的链式调用
 * ?: （空合并操作符）操作符的意思是：如果左边的求值结果为null，就是用右边的结果值
 */