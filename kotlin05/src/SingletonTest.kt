object ApplicationConfig {
    init {
        println("ApplicationConfig loading...")
    }

    fun doSomething(){
        println("doSomething...")
    }
}

fun main() {
    // 类名，也是实例名
    ApplicationConfig.doSomething()
    ApplicationConfig.doSomething()
}

/**
 * object关键字
 * 使用object关键字，你可以定义一个只能产生一个实例的类-单例
 * 使用object关键字有三种方式
 * 对象声明
 * 对象表达式
 * 伴生对象
 *
 * 对象声明
 * 对象声明有利于组织代码和管理状态
*/