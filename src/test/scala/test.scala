package test

import org.specs2.mutable._

class test extends Specification {

  "simple test" should {
    "have neo4j started on 7474" in {
      val a = readChar
      a must be_===('a')
    }
  }
}