package mediator

import java.util.*

class Chatroom {
    companion object {
        fun showMessage(user: User, message : String) = println("${Date()} [${user.name}] : ${message}" )
    }
}