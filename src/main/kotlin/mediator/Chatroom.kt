package mediator

import java.util.*

class Chatroom {
    fun showMessage(user: User, message : String) = println("${Date()} [${user.name}] : ${message}" )
}