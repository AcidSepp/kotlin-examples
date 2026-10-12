package collections

// snippet: main
fun myHigherOrderFunction(myFunction: (Int) -> Int) {
    myFunction(1)
}

fun myOtherHigherOrderFunction(): (Int) -> Int {
    return { it -> it + 1 }
}
// snippet: /main
