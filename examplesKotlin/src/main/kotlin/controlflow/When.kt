package controlflow

fun main(args: Array<String>) {
  val x = args[0].toInt()

  // snippet: whenSubject
  when (x) {
    1 -> println("x == 1")
    2 -> println("x == 2")
    else -> {
      println("x ist weder 1 noch 2")
    }
  }
  // snippet: /whenSubject

  // snippet: whenExpression
  val y = when (x) {
    3, 5 -> "drünf"
    4 -> "vier"
    else -> {
      "was anderes"
    }
  }
  // snippet: /whenExpression
  println("x ist $y")

  // snippet: whenConditions
  when {
    x < 0 -> println("x < 0")
    x > 0 -> println("x > 0")
    else -> {
      println("x == 0")
    }
  }
  // snippet: /whenConditions
}
