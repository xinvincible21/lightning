import sbt._
import Keys._

object AdserverBuild extends Build {

  val buildSettings = Defaults.defaultSettings ++ Seq(
    name := "test",
    version := "0.0.1",
    organization := "invincible",
    scalaVersion := "2.10.3",
    libraryDependencies ++= Seq(
      "com.typesafe.akka" %% "akka-actor" % "2.3.0",
      "com.typesafe.akka" %% "akka-slf4j" % "2.3.0",
      "ch.qos.logback" % "logback-classic" % "1.0.10",
      "com.typesafe.akka" %% "akka-testkit" % "2.3.0" % "test",
      "org.scalatest" % "scalatest_2.11" % "2.2.1" % "test",
      "com.typesafe.akka" %% "akka-cluster" % "2.3.3"
    )
  )

  val adserver = Project("test", file("."), settings = buildSettings)

}
