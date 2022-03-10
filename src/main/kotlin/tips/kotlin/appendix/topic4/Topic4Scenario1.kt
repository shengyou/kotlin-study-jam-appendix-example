package tips.kotlin.appendix.topic4

fun main() {
    val messageSuccess = MessageSuccess("Yay!")
    val messageSuccess2 = MessageSuccess("It works!")
    val messageFailure = MessageFailure("Boo!", Exception("Something went wrong"))

    val myMessageType: MessageType = messageFailure
    val myMessage = when (myMessageType) {
        is MessageSuccess -> myMessageType.msg
        is MessageFailure -> "${myMessageType.msg} ${myMessageType.e.message}"
    }

    println(myMessage)
}
