name := """multi-db"""

version := "1.0-SNAPSHOT"

lazy val root = (project in file(".")).enablePlugins(PlayJava, PlayEbean)

lazy val sub = project.in(file("models2"))
        .enablePlugins(PlayJava, PlayEbean, PlayEnhancer)

scalaVersion := "2.11.7"

libraryDependencies ++= Seq(
  javaJdbc,
  cache,
  javaWs,
  "mysql" % "mysql-connector-java" % "5.1.36"
)
