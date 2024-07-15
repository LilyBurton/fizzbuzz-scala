object Fizzbuzz {
    def generate(number: Int): String = {
      (1 to number).map { i =>
        if (i % 3 == 0 && i % 5 == 0) "FizzBuzz"
        else if (i % 3 == 0) "Fizz"
        else if (i % 5 == 0) "Buzz"
        else i.toString
      }.mkString(", ")
    }
  }