package loops

import kotlin.random.Random

fun main() {
  // snippet: whileLoops
  val items = listOf("apple", "banana", "kiwifruit")

  var index = 0
  while (index < items.size) {
    println("Element bei $index ist ${items[index]}")
    index++
  }

  var toComplete: Boolean
  do {
    val roll = Random.nextInt(1, 7)
    println("Gewürfelt: $roll")
    toComplete = roll != 6
  } while (toComplete)
  // snippet: /whileLoops
}
