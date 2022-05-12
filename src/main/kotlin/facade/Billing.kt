package facade

class Billing {
    fun getPayableAmount(item: Item) : Double = (item.amount * item.stock) + getTax(item)
    fun getTax(item: Item) : Double = item.amount * .12 * item.stock
}

