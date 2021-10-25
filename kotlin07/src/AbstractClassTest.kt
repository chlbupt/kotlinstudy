abstract class Gun(val range: Int) {
    abstract fun pullTrigger(): String

    protected fun doSomething() {
        println("doSomething")
    }
}
// 接口是多实现的，类是单继承

class AK47(val price: Int) : Gun(range = 500), Movable {
    override fun pullTrigger(): String {
        TODO("not implemented")
    }

    override var wheels: Int
        get() = TODO("not implemented") //To change initializer of created properties use File | Settings | File Templates.
        set(value) {}

    override fun move(movable: Movable): String {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

}