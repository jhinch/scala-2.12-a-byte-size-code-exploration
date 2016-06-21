package examples.mixins

trait Example2 {
  def combine(a: Int, b: Int): Int =
    a + b
}

private[mixins] class Example2Impl extends Example2

