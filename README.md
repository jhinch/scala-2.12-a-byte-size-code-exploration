# Scala 2.12: A byte size code exploration

An analysis on how Scala 2.12 differs in byte code from Scala 2.11 with a control of Java 8

To compile the project run:

    sbt "+ compile"

You can then analyze the bytecode using `javap` for example:

    javap -c target/scala-2.12.0-M5/classes/examples/lambdas/Example2* | less

To look deeper you can use the verbose mode of javap with `-v`
