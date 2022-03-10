package tips.kotlin.appendix.topic4.classes

sealed class MessageType

class MessageSuccess(var msg: String): MessageType()

class MessageFailure(var msg: String, var e: Exception): MessageType()
