import Dependencies._

lazy val root = (project in file("."))
  .settings(
    organization  := "com.example",
    scalaVersion  := "$scalaVersion$",
    version       := "0.1.0-SNAPSHOT",
    name          := """$name;format="norm"$""",
    scalacOptions in Compile ++= Seq(
      "-deprecation",
      "-encoding", "UTF-8",
      "-feature",
      "-unchecked",
      // "-Xfatal-warnings",
      "-Xlint",
      "-Yno-adapted-args",
      "-Ypartial-unification",
      "-Ywarn-dead-code",
      "-Ywarn-extra-implicit",
      "-Ywarn-inaccessible",
      "-Ywarn-infer-any",
      "-Ywarn-nullary-override",
      "-Ywarn-nullary-unit",
      "-Ywarn-numeric-widen",
      "-Ywarn-unused:implicits",
      "-Ywarn-unused:imports",
      "-Ywarn-unused:locals",
      "-Ywarn-unused:params",
      "-Ywarn-unused:patvars",
      "-Ywarn-unused:privates",
      "-Ywarn-value-discard"
    ),

    libraryDependencies += scalaTest % Test
  )
