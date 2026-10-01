package loops

fun main() {
  // snippet: forLoops
  val items = listOf("apple", "banana", "kiwifruit")

  for (item in items) {
    println(item)
  }

  for (index in items.indices) {
    println("item at $index is ${items[index]}")
  }

  for ((index, item) in items.withIndex()) {
    println("Element bei $index ist $item")
  }
  // snippet: /forLoops
}
