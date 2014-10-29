name := "REST com PlayFramework"

version :="0.1.0-SNAPSHOT"

libraryDependencies ++= Seq(
javaWs,
  "org.apache.cxf" % "cxf-rt-bindings-soap" % "2.7.12",
  "org.springframework" % "spring-context" % "4.1.0.RELEASE",
"eu.imind" %% "play-cxf" % "1.1")

lazy val root = (project in file(".")).enablePlugins(PlayJava)
