package facade

class ShopFacade {
    private val billing : Billing = Billing()
    private val delivery : Delivery = Delivery()
    private val warehouse : Warehouse = Warehouse()

    private var item : Item? = null

    fun addItem(item : Item) : String {
        this.item = item
        return "Added ${item.name}"
    }

    fun checkout() : String {
        return if (warehouse.isAvailable(this.item!!))
            warehouse.reserveItem(this.item!!)
        else "${this.item!!.name} is not available"
    }

    fun pay() : Double = billing.getPayableAmount(this.item!!)

    fun deliver() : String {
        return delivery.retrievePackage(this.item!!) + delivery.assignPackage(this.item!!)
    }

}