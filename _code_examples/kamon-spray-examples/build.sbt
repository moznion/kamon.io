scalaVersion := "2.11.6"

// tag:base-kamon-dependencies:start
libraryDependencies ++= Seq(
  "io.spray" %% "spray-can" % "1.3.1",
  "io.spray" %% "spray-client" % "1.3.1",
  "io.spray" %% "spray-routing" % "1.3.1",
  "io.kamon" %% "kamon-core" % "0.3.6-3792237be91790056f733d10e3255d4cff7f8eaf",
  "io.kamon" %% "kamon-spray" % "0.3.6-3792237be91790056f733d10e3255d4cff7f8eaf"
)
// tag:base-kamon-dependencies:end

// Additional dependencies.
libraryDependencies ++= Seq(
  "ch.qos.logback"    %  "logback-classic" % "1.1.2",
  "com.typesafe.akka" %% "akka-actor"      % "2.3.9",
  "com.typesafe.akka" %% "akka-slf4j"      % "2.3.9"
)

aspectjSettings

javaOptions in run <++= AspectjKeys.weaverOptions in Aspectj

fork in run := true
