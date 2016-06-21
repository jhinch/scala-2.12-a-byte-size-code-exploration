package examples.mixins

object Example4 {
  def sequence(a: Example4, b: Example4, value: String): String = {
    b.augment(a.augment(value))
  }
}

trait Example4 {
  def augment(value: String): String
}
