import sbt._
import Keys._

// Author: Robin

object Build extends Build {
	import BuildSettings._
	import Dependencies._

  	// root
	lazy val root = Project("root", file("."))
		.aggregate(examples, $app_name;format="camel"$)
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

	lazy val $app_name;format="camel"$ = Project("$app_name$", file("$app_name;format="camel,hypen"$"))
		.settings(moduleSettings: _*)
		.settings(libraryDependencies ++=
			compile(ansviaCommons) ++
			test(specs2) ++
			runtime(logback)
		)
}
