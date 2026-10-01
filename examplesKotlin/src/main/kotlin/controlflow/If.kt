package controlflow

// snippet: ifStatement
fun maxOf1(a: Int, b: Int): Int {
  if (a > b) {
    return a
  } else {
    return b
  }
}
// snippet: /ifStatement

// snippet: ifExpression
fun maxOf2(a: Int, b: Int) = if (a > b) {
  a
} else {
  b
}
// snippet: /ifExpression

fun main() {
  println(maxOf1(3, 7))
  println(maxOf2(3, 7))
}
