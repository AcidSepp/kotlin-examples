package threads

// snippet: threadSafety
fun main() {
  val intReference = object {
    var myInt = 1337
  }

  val thread1 = Thread({
    repeat(1000) {
      intReference.myInt++
    }
  })

  val thread2 = Thread({
    repeat(1000) {
      intReference.myInt++
    }
  })

  thread1.start()
  thread2.start()
  thread1.join()
  thread2.join()

  println(intReference.myInt)
}
// snippet: /threadSafety

