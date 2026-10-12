import interop.JavaSquare;
import interop.JavaSquareHolder;
import interop.KotlinSquare;
import interop.KotlinSquareHolder;

void main() {
// snippet: class
  JavaSquare js = new JavaSquare(42);
  KotlinSquare ks = new KotlinSquare(43);

  IO.println(js.getArea());
  IO.println(ks.getArea());
// snippet: /class


// snippet: nullabilityCheck
  JavaSquareHolder jsh = new JavaSquareHolder(js);
  KotlinSquareHolder ksh = new KotlinSquareHolder(ks);

  IO.println(jsh.getJavaSquare().getArea());
  IO.println(ksh.getKotlinSquare().getArea());
// snippet: /nullabilityCheck
}
