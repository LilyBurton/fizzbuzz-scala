import org.scalatest.funsuite.AnyFunSuite
class FizzbuzzTest extends AnyFunSuite {
  test("lists the numbers up to one") {
    assert(Fizzbuzz.generate(1) === "1")
  }

  test("lists the numbers up to two") {
    assert(Fizzbuzz.generate(2) === "1, 2")
  }

  test("Turn a number multiple of three into Fizz") {
    assert(Fizzbuzz.generate(3) === "1, 2, Fizz")
  }

  test("Turn a number multiple of five into Buzz") {
    assert(Fizzbuzz.generate(5) === "1, 2, Fizz, 4, Buzz")
  }

  test("Turn a number multiple of fifteen into FizzBuzz") {
    assert(Fizzbuzz.generate(15) === "1, 2, Fizz, 4, Buzz, Fizz, 7, 8, Fizz, Buzz, 11, Fizz, 13, 14, FizzBuzz")
   }
  }