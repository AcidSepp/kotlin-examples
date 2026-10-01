package classes

// snippet: properties
class Instrument {
  var type: String = "A generic Instrument"
    get() {
      print("The getter was called")
      return field
    }
    set(value) {
      print("The setter was called")
      field = value
    }
}

fun main() {
  val myInstrument = Instrument()
  myInstrument.type = "Guitar"
  println(myInstrument.type)
}
// snippet: /properties
