import akka.actor.AbstractActor
import akka.event.Logging
import akka.event.LoggingAdapter


class MyActor01 : AbstractActor() {
    private val log = Logging.getLogger(context.system, this)

    override fun createReceive(): Receive {
        return receiveBuilder()
            .match(String::class.java) { s -> log.info("Received String message: {}", s) }
            .matchAny { o -> log.info("received unknown message") }
            .build()
    }


    /*
    fun receive = {
        case "test" => log.info("received test")
        case _      => log.info("received unknown message")
    }
     */
}
