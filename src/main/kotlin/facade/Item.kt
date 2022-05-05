package facade

class Item {
    var name : String = ""
    var amount : Double = 0.00
    var stock : Int = 0

    constructor(name: String, amount: Double, stock: Int) {
        this.name = name
        this.amount = amount
        this.stock = stock
    }
}