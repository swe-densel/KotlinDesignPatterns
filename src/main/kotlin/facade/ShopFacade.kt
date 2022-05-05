package facade

class ShopFacade {
    private var billing : Billing? = null
    private var delivery : Delivery? = null
    private var warehouse : Warehouse? = null

    val itemList = ArrayList<Item>()

    constructor(){
        billing = Billing()
        delivery = Delivery()
        warehouse = Warehouse()
    }

    fun addItem(item : Item) {
        println("Added ${item.name}")
        itemList.add(item)
    }

    fun checkout() {
        for (item in itemList){
            if (warehouse?.isAvailable(item) == true)
                warehouse?.reserveItem(item)
        }
    }

    fun pay() = billing!!.getPayableAmount(itemList)

    fun deliver() {
        for (item in itemList){
            delivery?.retrievePackage(item)
            delivery?.assignPackage(item)
        }
    }

}