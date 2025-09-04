
import org.scalatest.funsuite.AnyFunSuite

class GreeterSuite extends AnyFunSuite {
  test("hi returns correct string") {
    val greeter = Greeter("Alex")
    val hiMsg = greeter.hi
    assert(hiMsg === "hi Alex")
  }

  test("bye returns correct string") {
    val greeter = Greeter("Aoife")
    val hiMsg = greeter.bye
    assert(hiMsg === "bye Aoife")
  }
}
