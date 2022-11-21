ThisBuild / version := "0.1.0-SNAPSHOT"

ThisBuild / scalaVersion := "2.12.16"

lazy val root = (project in file("."))
  .settings(
    name := "hiveudf"
  )

unmanagedJars in  Compile += file("C:/Users/Consultant/Downloads/hive-exec-3.1.2.jar")
