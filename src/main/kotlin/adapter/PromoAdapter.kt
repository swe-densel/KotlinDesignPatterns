package adapter

class PromoAdapter(var rawSMS: RawSMS) : Promo(), PromoProcessing {

    override fun registerPromo() {
        this.message = rawSMS.message
    }

}