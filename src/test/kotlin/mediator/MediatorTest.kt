package mediator

import org.junit.jupiter.api.Test

class MediatorTest {

    @Test
    fun startChatRoom(){
        val robert  = User("Robert")
        val john = User("John")

        robert.sendMessage("Hi John!")
        john.sendMessage("Hello Robert!")

        //need to assertEquals the sendMessages
    }
}