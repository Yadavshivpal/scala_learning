import akka.actor.Actor
import akka.actor.ActorSystem
import akka.actor.Props
import akka.actor._
class HelloActor extends Actor {
  def receive = {
    case "hello" => println("hello back at you")
    case _ => println("Unknown?")
  }
}
object Main extends App {
  // an actor needs an ActorSystem
  val system = ActorSystem("HelloSystem")
  // create and start the actor
  val helloActor = system.actorOf(Props[HelloActor], name = "helloactor")
  // send the actor two messages
  helloActor ! "hello"
  helloActor ! "Hey"
  // shut down the system
  system.terminate()
}