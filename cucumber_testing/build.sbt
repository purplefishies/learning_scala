name := "sbt_cucumber_test"

version := "1.0"

scalaVersion := "2.10.0"

libraryDependencies += "org.scalatest" % "scalatest_2.10" % "2.0" % "test"

libraryDependencies += "info.cukes" % "cucumber-scala_2.10" % "1.2.2" % "test"

cucumberSettings

// cucumberFeaturesLocation := "src/test/scala/feature/"
//cucumberStepsBasePackage := "features.steps"
