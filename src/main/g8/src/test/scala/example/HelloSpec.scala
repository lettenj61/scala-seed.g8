package example

import org.scalatest._

class HelloSpec extends FunSpec {
  describe("The Hello object") {
    it("should say hello") {
      assert(Hello.greeting == "hello")
    }
  }
}
