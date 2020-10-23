import Dependencies._

ThisBuild / scalaVersion     := "2.13.3"
ThisBuild / version          := "0.1.0-SNAPSHOT"
ThisBuild / organization     := "com.example"
ThisBuild / organizationName := "example"

lazy val root = (project in file("."))
  .settings(
    name := "herding-cats",
    libraryDependencies ++= Seq(
      scalaTest % Test,
      "org.typelevel" %% "simulacrum" % "1.0.0",
      "org.typelevel" %% "cats-core" % "2.1.1"
    ),
    scalacOptions ++= Seq(
      "-Ymacro-annotations",
      "-Ypartial-unification"
    )
  )

// See https://www.scala-sbt.org/1.x/docs/Using-Sonatype.html for instructions on how to publish to Sonatype.
