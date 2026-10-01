package nullsafety

// snippet: safeCall
fun printDepartmentHead(employee: Employee) {
  println(employee.department?.head?.name)
}
// snippet: /safeCall

fun main() {
  val employee = Employee(Department(Person("Bob")))
  printDepartmentHead(employee)
  printDepartmentHead(Employee(null))

  // snippet: safeCallLet
  employee.department?.head?.name?.let { println(it) }
  // snippet: /safeCallLet
}
