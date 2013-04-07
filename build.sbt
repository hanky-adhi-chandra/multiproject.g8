scalaVersion := "2.9.1"

seq(giter8Settings :_*)

resolvers ++= Seq(
	"Sonatype Releases" at "https://oss.sonatype.org/content/groups/scala-tools",
	"typesafe repo"   at "http://repo.typesafe.com/typesafe/releases/"
)

//libraryDependencies <+= sbtVersion("org.scala-sbt" % "scripted-plugin_2.9.1" % _)