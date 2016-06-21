package examples.lambdas

  class Example3 {
    def doIt(): Unit = {
      val result = withTwo("Hello", 1, _.substring(_))
      println(result)
    }

    def withTwo(s: String, i: Int, f: (String, Int) => String): String =
      f.apply(s, i)
  }


