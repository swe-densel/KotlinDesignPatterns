package facade

class Item (name: String, amount: Double, stock: Int){
    var name : String = ""
    var amount : Double = 0.00
    var stock : Int = 0

    init {
        this.name = name
        this.amount = amount
        this.stock = stock
    }
}