import sbt._
import Keys._

object PluginDef extends Build {
  lazy val root = Project("plugins", file(".")).settings(scalaVersion:="2.9.1") dependsOn( g8plugin )
  lazy val g8plugin =
    ProjectRef(uri("git://github.com/n8han/giter8#0.4.4"), "giter8-plugin")
}
