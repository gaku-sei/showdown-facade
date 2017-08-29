enablePlugins(ScalaJSPlugin)
enablePlugins(ScalaJSBundlerPlugin)

name := "ShowDown Facade"

normalizedName := "showdown-facade"

scalaVersion := "2.12.2"

version := "0.1.0"

libraryDependencies += "org.scalatest" %%% "scalatest" % "3.0.0" % "test"

npmDependencies in Compile += "showdown" -> "1.7.3"
