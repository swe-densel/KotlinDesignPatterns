package facade

import org.junit.jupiter.api.Test
import kotlin.test.assertEquals

class FacadeTest {
    val item1 = Item("Item 1", 5.00, 30)
    val shop = ShopFacade()

    @Test
    fun facadeTest() {
        shop.deliver()
    }

    @Test
    fun addItemTest(){
        assertEquals(shop.addItem(item1), "Added ${item1.name}")
    }

    @Test
    fun checkoutTest(){
        assertEquals(shop.checkout(), "Reserved ${item1.name}")
    }

    @Test
    fun payTest(){
        assertEquals(shop.pay(), 168.00)
    }

    @Test
    fun deliverTest(){
        assertEquals(shop.deliver(),
            "Retrieve package of ${item1.name} Assign package of ${item1.name} ")
    }
}