package tips.kotlin.appendix.topic4

import tips.kotlin.appendix.topic4.classes.MessageFailure
import tips.kotlin.appendix.topic4.classes.MessageSuccess
import tips.kotlin.appendix.topic4.classes.MessageType

fun main() {
    val messageSuccess = MessageSuccess("Yay!")
    val messageSuccess2 = MessageSuccess("It works!")
    val messageFailure = MessageFailure("Bol!", Exception("Something went wrong"))

    val myMessageType: MessageType = messageFailure
    val myMessage = when (myMessageType) {
        is MessageSuccess -> myMessageType.msg
        is MessageFailure -> "${myMessageType.msg} ${myMessageType.e.message}"
    }

    println(myMessage)
}
