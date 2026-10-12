package interop

fun main() {
// snippet: class
  val js = JavaSquare(42.0)
  val ks = KotlinSquare(43.0)

  println(js.area)
  println(ks.area)
// snippet: /class

// snippet: nullabilityCheck
  val jsh = JavaSquareHolder(js)
  val ksh = KotlinSquareHolder(ks)

  jsh.javaSquare.area
  ksh.kotlinSquare.area
// snippet: /nullabilityCheck
}
