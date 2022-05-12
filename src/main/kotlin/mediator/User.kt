package mediator

class User(var name: String) {
    fun sendMessage(message : String) = Chatroom.showMessage(this, message)
}