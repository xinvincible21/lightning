package adserver

import akka.actor.{ActorPath, Props, ActorSystem}
//import org.scalatest._

//class WorkerSpec extends TestKit(ActorSystem("WorkerSpec"))
//       with ImplicitSender
//       with WordSpec
//       with BeforeAndAfterAll
//       with MustMatchers {
//
//  override def afterAll() {
//    system.shutdown()
//  }
//
//  def worker(name: String) = system.actorOf(Props(
//    new TestWorker(ActorPath.fromString(
//      "akka://%s/user/%s".format(system.name, name)))))
//
//  "Worker" should {
//    "work" in {
//      // Spin up the master
//      val m = system.actorOf(Props[Master], "master")
//      // Create three workers
//      val w1 = worker("master")
//      val w2 = worker("master")
//      val w3 = worker("master")
//      // Send some work to the master
//      m ! "Hithere"
//      m ! "Guys"
//      m ! "So"
//      m ! "What's"
//      m ! "Up?"
//      // We should get it all back
//      expectMsgAllOf("Hithere", "Guys", "So", "What's", "Up?")
//    }
//  }
//}
