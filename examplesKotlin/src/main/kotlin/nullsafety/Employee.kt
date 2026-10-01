package nullsafety

class Person(val name: String?)

class Department(val head: Person?)

class Employee(val department: Department?)
