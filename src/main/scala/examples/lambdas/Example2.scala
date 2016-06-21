package examples.lambdas

class Example2 {
  def useIt(): Unit = {
    println(condition(true, helloWorld))
  }

  def condition(condition: Boolean, f: () => String): String = {
    if (condition)
      f.apply()
    else
      "false"
  }

  def helloWorld(): String =
    "Hello Java 8"
}
