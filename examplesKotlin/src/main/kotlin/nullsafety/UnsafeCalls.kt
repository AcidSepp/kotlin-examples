package nullsafety

// snippet: unsafeCall
fun printDepartmentHeadUnsafe(employee: Employee) {
  println(employee.department!!.head!!.name!!)
}
// snippet: /unsafeCall

fun main() {
  printDepartmentHeadUnsafe(Employee(Department(Person("Bob"))))
  printDepartmentHeadUnsafe(Employee(null)) // NullPointerException
}
