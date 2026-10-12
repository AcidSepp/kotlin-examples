package collections

// snippet: main
fun main() {
    val strings = listOf("test", "blub", "foo")
    val flat = strings.flatMap {
        it.toCharArray().toList()
    }
    println(flat)
}
// snippet: /main
