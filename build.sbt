name := "mustache"

version := "1.3"

scalaVersion := "2.12.1"

resolvers += "Typesafe Repository" at "http://repo.typesafe.com/typesafe/releases/"

resolvers += "Typesafe Snapshots Repository" at "http://repo.typesafe.com/typesafe/snapshots/"

libraryDependencies ++= Seq(
  "junit" % "junit" % "4.8.1" % "test->default",
  "org.specs2" % "specs2_2.10" % "2.3.12-scalaz-7.1.0-M6" % "test->default",
  "com.typesafe.akka" % "akka-actor_2.12" % "2.4.16"
)
