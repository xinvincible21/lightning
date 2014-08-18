/*package adserver

import akka.actor.{ActorRef, ActorPath}
import scala.concurrent.Future
import akka.pattern.pipe

class TestWorker(masterLocation: ActorPath) extends Worker(masterLocation) {
  // We'll use the current dispatcher for the execution context.
  // You can use whatever you want.
  implicit val ec = context.dispatcher
 
  def doWork(workSender: ActorRef, msg: Any): Unit = {
    Future {
      workSender ! msg
      WorkComplete("done")
    } pipeTo self
  }
}*/