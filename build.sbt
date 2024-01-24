ThisBuild / version := "0.1.0-SNAPSHOT"

ThisBuild / scalaVersion := "3.3.1"

lazy val root = (project in file("."))
  .enablePlugins(ScalaJSPlugin, JSDependenciesPlugin)
  .settings(
    crossScalaVersions := Seq("2.13.12", "3.3.1"),
    name := "ScalaJsDynamic",
    jsDependencies += ProvidedJS / "custom.js",
    scalaJSUseMainModuleInitializer := true
  )
