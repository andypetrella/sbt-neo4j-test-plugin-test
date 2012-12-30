//libraryDependencies += "org.neo4j.app" % "neo4j-server" % "1.9.M03" classifier "static-web"  classifier "tests" classifier ""

//libraryDependencies += "org.neo4j" % "neo4j-kernel" % "1.9.M03"  classifier "tests" classifier ""

libraryDependencies += Defaults.sbtPluginExtra("be.nextlab" % "sbt-neo4j-test-plugin" % "0.0.1-SNAPSHOT", "0.12", "2.10")

addSbtPlugin("net.virtual-void" % "sbt-dependency-graph" % "0.7.0")