import sbt._

lazy val commonSettings: Seq[Setting[_]] = Seq(
  organization := "org.decaf",
  version in ThisBuild := "1-SNAPSHOT",
  scalaVersion := "2.11.7",
  libraryDependencies ++= Seq(
    "com.typesafe.akka" %% "akka-actor" % "2.4.0",
    "com.typesafe.akka" %% "akka-remote" % "2.4.0",
    "com.typesafe.akka" %% "akka-slf4j" % "2.4.0",
    "com.typesafe.akka" %% "akka-testkit" % "2.4.0" % "test",
    "com.twitter" %% "chill" % "0.7.2",
    "com.twitter" %% "chill-akka" % "0.7.2"
  ),
  libraryDependencies ++= Seq(
    "org.specs2" %% "specs2-core" % "3.5" % "test"
  ),
  scalacOptions ++= Seq(
    "-deprecation", "-feature", "-language:postfixOps", "-Xlint", "-Xlog-free-terms", "-Xlog-free-types",
    "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-language:postfixOps",
    "-Ywarn-dead-code", "-Ywarn-numeric-widen", "-Ywarn-inaccessible", "-unchecked", "-Xfatal-warnings"
  ),
  scalacOptions in Test ++= Seq(
    "-language:reflectiveCalls"
  )
)

lazy val httpServerSettings: Seq[Setting[_]] =
  Seq(
    libraryDependencies ++= Seq(
      "com.typesafe.akka" %% "akka-http-experimental" % "2.0-M1",
      "com.typesafe.akka" %% "akka-http-core-experimental" % "2.0-M1",
      "com.typesafe.akka" %% "akka-http-testkit-experimental" % "2.0-M1" % "test"
    )
  )

lazy val root = Project("root", file(".")).aggregate(common, crawler, server, website)
  .settings(publish := {},
            publishLocal := {})
  .settings(commonSettings: _*)

lazy val common = Project("common", file("./common"))
  .settings(commonSettings: _*)

lazy val crawler = Project("crawler", file("./crawler")).dependsOn(common)
  .settings(commonSettings: _*)
  .settings(
    libraryDependencies ++= Seq(
      "com.typesafe.akka" %% "akka-stream-experimental" % "2.0-M1"
    )
  )

lazy val server = Project("server", file("./server")).dependsOn(common)
  .settings(commonSettings: _*)
  .settings(httpServerSettings: _*)

lazy val website = Project("website", file("./website")).dependsOn(common)
  .settings(commonSettings: _*)
  .settings(httpServerSettings: _*)
