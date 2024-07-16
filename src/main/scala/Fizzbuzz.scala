object Fizzbuzz {
    def generate(number: Int): String = {
      (1 to number).map(fizzBuzzValue).mkString(", ")
    }
    private def fizzBuzzValue(number: Int): String = {
    if (isDividable(number, 15)) {
      "FizzBuzz"
    } else if (isDividable(number, 3)) {
      "Fizz"
    } else if (isDividable(number, 5)) {
      "Buzz"
    } else {
      number.toString
    }
  }

  private def isDividable(dividee: Int, divider: Int): Boolean = {
    dividee % divider == 0
  }
}



