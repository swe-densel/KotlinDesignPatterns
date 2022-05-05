package singleton

//how to static?
class SingletonLazyClass {
    var instance : SingletonLazyClass? = null
        get() = field ?: SingletonLazyClass()

    var id : String = ""
}