package examples.lambdas

class Example4 {
  def encloseIt(i: Int): Unit = {
    println(aug(_.substring(i)))
  }

  def aug(f: String => String): String =
    f.apply("Hello")
}
