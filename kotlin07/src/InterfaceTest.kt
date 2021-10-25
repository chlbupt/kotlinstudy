interface Movable1 {
    var maxSpeed: Int
    var wheels: Int

    fun move(movable: Movable1): String
}

class Car1(_name: String, override var wheels: Int = 4) : Movable1 {
    override var maxSpeed: Int
        get() = TODO("not implemented") //To change initializer of created properties use File | Settings | File Templates.
        set(value) {}

    override fun move(movable: Movable1): String {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

}

fun main() {

}