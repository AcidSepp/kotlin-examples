package functions

// snippet: main
fun myHigherOrderFunction(myFunction: (Int) -> Int) {
    myFunction(1)
}

fun myOtherHigherOrderFunction(): (Int) -> Int {
    return fun(it: Int): Int {
      return it + 1
    }
}
// snippet: /main
