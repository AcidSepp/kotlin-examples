package interop;

public class JavaSquare {

  private double sideLength;

  public JavaSquare(final double width) {
    this.sideLength = width;
  }

  public double getWidth() {
    return sideLength;
  }

  public void setWidth(final double width) {
    this.sideLength = width;
  }

  public double getHeight() {
    return sideLength;
  }

  public void setHeight(final double height) {
    this.sideLength = height;
  }

  public double getArea() {
    return sideLength * sideLength;
  }

  public void setArea(final double area) {
    this.sideLength = Math.sqrt(area);
  }
}
