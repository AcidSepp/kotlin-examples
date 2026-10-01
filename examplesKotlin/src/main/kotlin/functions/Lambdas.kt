package functions

fun main() {
  // snippet: lambdaSum
  val sum: (Int, Int) -> Int = { x: Int, y: Int -> x + y }
  // snippet: /lambdaSum

  // snippet: lambdaMul
  val mul = { x: Int, y: Int -> x * y }
  // snippet: /lambdaMul

  // snippet: lambdaSquare
  val square: (Int) -> (Int) = { it * it }
  // snippet: /lambdaSquare

  // snippet: lambdaLong
  fun justCall(myLambda: (Int, Int) -> Int) = myLambda(1, 2)

  justCall({ x: Int, y: Int -> x + y })
  // snippet: /lambdaLong

  // snippet: lambdaShorter
  justCall() { x: Int, y: Int -> x + y }
  // snippet: /lambdaShorter

  // snippet: lambdaShortest
  justCall { x: Int, y: Int -> x + y }
  // snippet: /lambdaShortest
}
