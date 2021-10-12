import kotlin.math.absoluteValue

class Player(
    _name: String,
    _age: Int,
    _isNormal: Boolean
) {
    var name = _name
        get() = field.capitalize()
        set(value) {
            field = value.trim()
        }
    var age = _age
        get() = field.absoluteValue
        set(value) {
            field = value.absoluteValue
        }
    var isNormal = _isNormal
}


fun main() {
    val player = Player("Chl", -25, true)
    println(player.name)
    println(player.age)
    println(player.isNormal)
}

/**
 * 主构造函数
 * 我们在Player类的定义头中定义一个主构造函数，使用临时变量为Player的各个属性提供初始值
 * 在kotlin中，为便于识别，临时变量(包括仅引用一次的参数)，通常都会以下划线开头的名字命名
 *
 * */

