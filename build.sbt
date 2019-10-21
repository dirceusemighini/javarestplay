name := "REST com PlayFramework"

version :="0.1.0-SNAPSHOT"

scalaVersion := "2.10.6"

libraryDependencies ++= Seq(
javaWs,
  "org.apache.cxf" % "cxf-rt-bindings-soap" % "2.7.12",
  "org.springframework" % "spring-context" % "4.1.0.RELEASE"
)

lazy val root = (project in file(".")).enablePlugins(PlayJava)
