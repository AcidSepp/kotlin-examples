package classes

// snippet: classFunction
fun String.double() = this + this

fun main() {
  val myString = "test"
  println(myString.double())
}
// snippet: /classFunction
