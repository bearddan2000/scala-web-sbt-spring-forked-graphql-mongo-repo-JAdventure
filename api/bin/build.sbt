lazy val root = (project in file("."))
  .settings(
  // Project name (artifact name in Maven)
  name := "(scala-web-api-sbt)",

  // orgnization name (e.g., the package name of the project)
  organization := "example",

  version := "1.0-SNAPSHOT",

  // project description
  description := "Mongo API Project",

  scalaVersion := "2.12.10",

  libraryDependencies ++= Seq(
  "com.graphql-java" % "graphql-spring-boot-starter" % "5.0.2",
  "com.graphql-java" % "graphql-java-tools" % "5.2.4",
    "org.springframework.boot" % "spring-boot-starter-web" % "2.4.1",
    "org.springframework.boot" % "spring-boot-starter-data-mongodb" % "2.4.1"
   ),

  mainClass := Some("example.Main")
)
