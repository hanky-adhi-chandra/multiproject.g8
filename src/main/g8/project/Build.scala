import sbt._
import Keys._

// Author: Robin

object Build extends Build {
	import BuildSettings._
	import Dependencies._

  	// root
	lazy val root = Project("root", file("."))
		.aggregate(examples, $app_name$)
		.settings(basicSettings: _*)
		.settings(noPublishing: _*)
		
	// modules
	lazy val examples = Project("examples", file("examples"))
		.settings(moduleSettings: _*)
		.settings(libraryDependencies ++= 
			compile(ansviaCommons) ++
			test(specs2) ++
			runtime(logback)
		)

	lazy val $app_name$ = Project("$app_name$", file("$app_name$"))
		.settings(moduleSettings: _*)
		.settings(libraryDependencies ++=
			compile(ansviaCommons) ++
			test(specs2) ++
			runtime(logback)
		)
}
