name := "scala-2.12-java-8-and-you"

crossScalaVersions := Seq("2.11.8", "2.12.0-M5")

scalaVersion := "2.11.8"

scalacOptions := Seq(
  "-deprecation",
  "-feature",
  "-language:higherKinds",
  "-language:postfixOps",
  "-target:jvm-1.8",
  "-unchecked",
  "-Xfatal-warnings",
  "-Xlint",
  "-Xlog-free-terms",
  "-Ywarn-adapted-args",
  "-Ywarn-dead-code",
  "-Ywarn-numeric-widen",
  "-Ywarn-value-discard"
)
