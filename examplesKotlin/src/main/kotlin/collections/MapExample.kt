package collections

// snippet: main
fun main() {
    val list = listOf(1, 2, 3, 4, 5)
    val result = list.map {
        it + 1
    }
    println(result)
}
// snippet: /main
