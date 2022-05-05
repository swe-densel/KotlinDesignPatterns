package facade

import org.junit.jupiter.api.Test

class FacadeTest {

    @Test
    fun facadeTest() {
        val item1 = Item("Item 1", 5.00, 30)
        val item2 = Item("Item 2", 10.00, 20)

        val shop = ShopFacade()

        shop.addItem(item1)
        shop.addItem(item2)

        shop.checkout()
        shop.pay()
        shop.deliver()
    }
}