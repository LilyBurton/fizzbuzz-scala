object Fizzbuzz {
  // Define isDividableBy3 as a function that takes an Int and returns a Boolean
  val isDividableBy3: Int => Boolean = isDividable(_, 3)
  val isDividableBy5: Int => Boolean = isDividable(_, 5)
  val isDividableBy15: Int => Boolean = isDividable(_, 15)

  def generate(number: Int): String = {
    (1 to number).map(n => fizzBuzzValue(n)).mkString(", ")
  }

  private def fizzBuzzValue(number: Int): String = (number % 3, number % 5) match {
//    if (isDividableBy15(number)) {
//      "FizzBuzz"
//    } else if (isDividableBy3(number)) {
//      "Fizz"
//    } else if (isDividableBy5(number)) {
//      "Buzz"
//    } else {
//      number.toString
//    }

//    Pattern Matching
//    case number if isDividableBy15(number) => "FizzBuzz"
//    case number if isDividableBy3(number) => "Fizz"
//    case number if isDividableBy5(number) => "Buzz"
//    case _ => number.toString

//    Recursive
    case (0, 0) => "FizzBuzz"
    case (0, _) => "Fizz"
    case (_, 0) => "Buzz"
    case _ => number.toString

  }

  private def isDividable(dividee: Int, divider: Int): Boolean = {
    dividee % divider == 0
  }
}



