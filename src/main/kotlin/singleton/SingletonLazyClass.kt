package singleton

//how to static?
class SingletonLazyClass {
    var id : String = ""

    companion object {
        val instance = SingletonLazyClass()
    }
}