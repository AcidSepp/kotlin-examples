package classes

import kotlin.reflect.KProperty

// snippet: propertyDelegation
class MyClass {
  var myDelegatedInt: Int by IntDelegation(42)
}

class IntDelegation(initialValue: Int) {
  var value = initialValue

  operator fun getValue(thisRef: Any?, p: KProperty<*>): Int {
    println("The getter was called!")
    return value
  }

  operator fun setValue(thisRef: Any?, p: KProperty<*>, v: Int) {
    println("The setter was called!")
    this.value = v
  }
}

fun main() {
  val c = MyClass()
  c.myDelegatedInt = 1337
  println(c.myDelegatedInt)
}
// snippet: /propertyDelegation
