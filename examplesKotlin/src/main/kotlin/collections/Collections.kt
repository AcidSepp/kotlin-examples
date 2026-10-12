package collections

fun main() {
// snippet: immutableList
  val l1: List<String> = listOf(
    "string1",
    "string2"
  )
  println(l1[0])
  println(l1)
// snippet: /immutableList

// snippet: nullableImmutableList
  val l2: List<String?> = listOf(
    "string1",
    null,
    "string2"
  )
  println(l2[0])
  println(l2)
// snippet: /nullableImmutableList

// snippet: mutableList
  val l3: MutableList<String> = mutableListOf(
    "string1",
    "string2"
  )
  l3.add("string3")
  l3[0] = "changed"
  println(l3[0])
  println(l3)
// snippet: /mutableList

// snippet: mutableMap
  val m1: MutableMap<String, String> =
    mutableMapOf("key0" to "value0")
  m1["key0"] = "changed"
  println(m1["key0"])
  println(m1)
// snippet: /mutableMap
}
