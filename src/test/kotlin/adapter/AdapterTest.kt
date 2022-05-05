package adapter

import org.junit.jupiter.api.Test
import kotlin.test.assertEquals

class AdapterTest {

    @Test
    fun checkPromo(){
        val rawSMS = RawSMS("PISO PIZZA")
        val promoProcessing = PromoAdapter(rawSMS)
        promoProcessing.registerPromo()

        assertEquals("PISO PIZZA", promoProcessing.message)

    }

}