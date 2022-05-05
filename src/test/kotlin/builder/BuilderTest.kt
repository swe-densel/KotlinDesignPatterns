package builder

import org.junit.jupiter.api.Test
import kotlin.test.assertEquals

class BuilderTest {
    val builder = Form.FormBuilder("Densel", "Serrano")

    @Test
    fun checkFirstName(){
        assertEquals("Densel", builder.build().firstName)
    }

    @Test
    fun checkLastName(){
        assertEquals("Serrano", builder.build().lastName)
    }

    @Test
    fun checkAddress(){
        builder.addAddress("San Juan")
        assertEquals("San Juan", builder.build().address)
    }
}