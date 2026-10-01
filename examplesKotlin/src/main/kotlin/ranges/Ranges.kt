package ranges

fun main() {
  // snippet: ranges
  val x = 10
  if (x in 1..10) {
    println("liegt im Bereich")
  }

  for (x in 1..5) {
    print(x)
  }

  for (x in 9 downTo 0 step 3) {
    print(x)
  }
  // snippet: /ranges
}
