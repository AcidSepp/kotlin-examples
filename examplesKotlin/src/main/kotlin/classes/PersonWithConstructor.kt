package classes

// snippet: simplePerson
class Person2(var name: String)

fun main() {
  val myPerson = Person2("Paul")
  println(myPerson.name)
  myPerson.name = "Paula"
  println(myPerson.name)
}
// snippet: /simplePerson
