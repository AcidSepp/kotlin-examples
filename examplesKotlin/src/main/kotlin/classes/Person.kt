package classes

// snippet: simplePerson
class Person {
  var name = "Paul"
}

fun main() {
  val myPerson = Person()
  println(myPerson.name)
  myPerson.name = "Paula"
  println(myPerson.name)
}
// snippet: /simplePerson
