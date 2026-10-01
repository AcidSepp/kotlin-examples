package strings

fun main() {
  // snippet: stringTemplates
  val i = 10
  val s = "Kotlin"

  println("i = $i")
  println("Die Länge von $s beträgt ${s.length}")

  val sb = StringBuilder()
  sb.append("Hallo")
  sb.append(", world!")
  println(sb.toString())
  // snippet: /stringTemplates
}
