package threads

import kotlin.concurrent.atomics.AtomicInt
import kotlin.concurrent.atomics.ExperimentalAtomicApi
import kotlin.concurrent.atomics.incrementAndFetch

@OptIn(ExperimentalAtomicApi::class)
// snippet: threadSafety
fun main() {
  val intReference = AtomicInt(1337)

  val thread1 = Thread({
    repeat(1000) {
      intReference.incrementAndFetch()
    }
  })

  val thread2 = Thread({
    repeat(1000) {
      intReference.incrementAndFetch()
    }
  })

  thread1.start()
  thread2.start()
  thread1.join()
  thread2.join()

  println(intReference)
}
// snippet: /threadSafety
