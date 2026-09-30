package functions

// snippet: fun1
fun sum(a: Int, b: Int): Int {
  return a + b
}
// snippet: /fun1

// snippet: fun2
fun printSum1(a: Int, b: Int): Unit {
  println(sum(a, b))
}
// snippet: /fun2

// snippet: fun3
fun printSum2(a: Int = 1, b: Int) {
  println(sum(a, b))
}
// snippet: /fun3

// snippet: fun4
fun printSum3(a: Int, b: Int = 1) {
  println(sum(a, b))
}
// snippet: /fun4

// snippet: fun5
fun mul(a: Int, b: Int) = a * b
// snippet: /fun5
