package examples.lambdas

class Example1 {
  def useIt(): Unit = {
    println(condition(true, () => "Hello Java 8"))
  }

  def condition(condition: Boolean, f: () => String): String = {
    if (condition)
      f.apply()
    else
      "false"
  }
}
