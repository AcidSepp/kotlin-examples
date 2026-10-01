package nullsafety

class Item(val id: String, val info: String?) {
  fun loadInfo(): String? = info
}

val items = listOf(Item("1", "Erstes Element"), Item("2", null))

fun findItem(id: String): Item? = items.find { it.id == id }

// snippet: elvis
fun loadInfoById(id: String): String? {
  val item = findItem(id) ?: return null
  return item.loadInfo() ?: throw Exception("...")
}
// snippet: /elvis

fun main() {
  println(loadInfoById("1"))
  println(loadInfoById("3"))
  println(loadInfoById("2"))
}
