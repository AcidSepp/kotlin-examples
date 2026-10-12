package collections

fun main() {
  // @formatter:off
  // snippet: list
  val l = listOf(1, 2, 3, 4, 5)
  // snippet: /list
  // @formatter:on

  // snippet: forLoop
  for (i in l) {
    print(i)
  }
  // snippet: /forLoop


  // snippet: forLoopIndexed
  for ((index, i) in l.withIndex()) {
    print("index: $index value: $i")
  }
  // snippet: /forLoopIndexed

  // snippet: forEach
  l.forEach {
    println(it)
  }
  // snippet: /forEach

  // snippet: forEachIndexed
  l.forEachIndexed { index, i ->
    print("index: $index value: $i")
  }
  // snippet: /forEachIndexed
}
