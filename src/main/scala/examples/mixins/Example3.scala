package examples.mixins

trait Example3 extends Example3Mixin1 with Example3Mixin2

private[mixins] trait Example3Mixin1 {
  def plus(a: Int, b: Int): Int = {
    a + b
  }
}

private[mixins] trait Example3Mixin2 {
  def times(a: Int, b: Int): Int = {
    a * b
  }
}

private[mixins] class Example3Impl extends Example3
