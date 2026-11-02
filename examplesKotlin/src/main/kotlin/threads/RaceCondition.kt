package threads

import kotlin.concurrent.atomics.AtomicInt
import kotlin.concurrent.atomics.ExperimentalAtomicApi
import kotlin.concurrent.atomics.fetchAndUpdate
import kotlin.concurrent.atomics.plusAssign

@OptIn(ExperimentalAtomicApi::class)
// snippet: raceCondition
fun main() {
  val intReference = AtomicInt(1337)

  val thread1 = Thread({
    repeat(1000) {
      intReference += 5
      Thread.sleep(1)
    }
  })

  val thread2 = Thread({
    repeat(1000) {
      intReference.fetchAndUpdate {
        it * 5
      }
      Thread.sleep(1)
    }
  })

  thread1.start()
  thread2.start()
  thread1.join()
  thread2.join()

  println(intReference)
}
// snippet: /raceCondition

