package nullsafety

// snippet: nullSafety
val notNullText: String = "Definitiv nicht null"
val nullableText1: String? = "Könnte null sein"
val nullableText2: String? = null

fun funny(text: String?) {
  if (text != null)
    println(text)
  else
    println("Nichts zu drucken :(")
}

fun funnier(text: String?) {
  val toPrint = text ?: "Nichts zu drucken :("
  println(toPrint)
}
// snippet: /nullSafety

fun main() {
  funny(notNullText)
  funny(nullableText1)
  funny(nullableText2)
  funnier(nullableText2)
}
