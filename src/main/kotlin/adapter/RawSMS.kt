package adapter

class RawSMS {
    var transactionID : String = ""
    var timestamp : String = ""
    var message : String = ""
    var shortcode : String = ""
    var recipient : String = ""
    var sender : String = ""

    constructor(message: String) {
        this.message = message
    }
}