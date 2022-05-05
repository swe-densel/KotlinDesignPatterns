package facade

class Delivery {
    fun retrievePackage(item: Item) = println("Retrieve package of ${item.name}")
    fun assignPackage(item: Item) = println("Assign package of ${item.name}")
}