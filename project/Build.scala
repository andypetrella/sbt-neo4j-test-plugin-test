import sbt._
import Keys._

import be.nextlab.sbt.neo4j.Neo4JPlugin


object ApplicationBuild extends Build {

  val appName  = "test"
  val appVersion = "0.0.1-SNAPSHOT"

  val libs = Seq(
    "org.specs2" %% "specs2" % "1.12.3" % "test"
  )

  val main =
    Project(
      id = appName,
      base = file("."),
      settings = Project.defaultSettings ++ Neo4JPlugin.neo4jTestSettings ++ net.virtualvoid.sbt.graph.Plugin.graphSettings
    ).settings(
      scalaVersion := "2.10.0",
      version := appVersion,
      libraryDependencies ++= libs
    )

}