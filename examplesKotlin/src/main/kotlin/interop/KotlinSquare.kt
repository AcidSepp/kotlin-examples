package interop

import kotlin.math.sqrt

class KotlinSquare(private var sideLength: Double) {
  var width: Double
    get() = sideLength
    set(value) {
      sideLength = value
    }

  var height: Double
    get() = sideLength
    set(value) {
      sideLength = value
    }

  var area: Double
    get() = this.sideLength * this.sideLength
    set(area) {
      this.sideLength = sqrt(area)
    }
}
