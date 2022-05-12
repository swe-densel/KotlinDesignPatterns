package singleton

import org.junit.jupiter.api.Test
import kotlin.test.assertEquals

class SingletonTest {

    @Test
    fun checkID(){
        val singleTonObj = SingletonLazyClass.instance
        singleTonObj?.id = "Sample"

        assertEquals("Sample", singleTonObj!!.id)
    }

}