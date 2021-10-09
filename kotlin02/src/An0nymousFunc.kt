fun main() {
    val total = "Mississippi".count()

    println(total)

    val count = "Mississippi".count { letter ->
        letter == 's'
    }
    println(count)

    // 变量的类型是一个匿名函数
    /*val blessingFunction: () -> String
    blessingFunction = {
        val holiday = "New Year"
        // 和具名函数不一样，除了极少数的情况外，匿名函数不需要return关键字返回数据
        // 匿名函数会隐式或自动返回函数体最后一行语句的结果
        "Happy $holiday"
    }
    println(blessingFunction())*/

    /*val blessingFunction: (String) -> String = {name ->
        val holiday = "Hew Year"
        "$name, Happy $holiday"
    }

    println(blessingFunction("Jack"))*/

    /**
     * it 关键字
     * 定义只有一个参数的匿名函数时，可以使用it关键字来表示参数名
     * 当你需要传入两个值参，it关键字就不能用了
     *
     */

    /*val blessingFunction: (String) -> String = {
        val holiday = "Hew Year"
        "$it, Happy $holiday"
    }

    println(blessingFunction("Rose"))*/
    /**
     * 类型推断
     * 定义一个变量时，如果已把匿名函数作为变量赋值给它，就不需要显示致命变量类型了
     */

    /*val blessingFunction = {
        val holiday = "Hew Year"
        "Happy $holiday"
    }

    println(blessingFunction())*/

    /**
     * 类型推断
     * 类型推断也支持带参数的匿名函数，但为了帮助编译器更准确地推断变量类型，匿名函数的参数名和参数类型必须有
     */

    /*val blessingFunction: (String, Int) -> String = {name, year ->
        val holiday = "New Year"
        "$name, Happy $holiday $year"
    }
    println(blessingFunction("chl", 20))*/

    val blessingFunction = {name:String, year:Int ->
        val holiday = "New Year"
        "$name, Happy $holiday $year"
    }
    println(blessingFunction("chl", 20))
}