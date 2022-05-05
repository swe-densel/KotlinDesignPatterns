package facade

class Billing {

    fun getPayableAmount(itemList: ArrayList<Item>?) {
        for (item in itemList!!){
            val totalAmount : Double = item.amount + getTax(item)
            println("Total Amount: ${totalAmount}")
        }
    }

    fun getTax(item: Item) : Double = item.amount * .12
}

