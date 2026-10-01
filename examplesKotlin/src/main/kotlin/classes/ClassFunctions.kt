package classes

// snippet: classFunction
class Animal(val sound: String) {
  fun shout() {
    println(sound)
  }
}

fun main() {
  val cat = Animal("miau!")
  cat.shout()
}
// snippet: /classFunction
