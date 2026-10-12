package interop;

import org.jetbrains.annotations.NotNull;


// snippet: JavaSquareHolder
public class JavaSquareHolder {

  private final @NotNull JavaSquare javaSquare;

  public JavaSquareHolder(final @NotNull JavaSquare javaSquare) {
    this.javaSquare = javaSquare;
  }

  public @NotNull JavaSquare getJavaSquare() {
    return javaSquare;
  }
}
// snippet: /JavaSquareHolder
