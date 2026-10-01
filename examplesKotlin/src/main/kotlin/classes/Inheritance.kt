package classes

// snippet: inheritance
open class Furniture(val brand: String)

class Table(brand: String) : Furniture(brand)

fun main() {
  val table = Table("Holzbau Holzwurm")
  println(table.brand)
}
// snippet: /inheritance
