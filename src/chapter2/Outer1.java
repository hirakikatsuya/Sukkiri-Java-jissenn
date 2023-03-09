package chapter2;

public class Outer1 {
  int outerField;
  static int outerStaticField;

  static class Inner {
    void innerMethod() {
      outerStaticField = 10;
    }
  }

  void outerMethod() {
    Inner ic = new Inner();
  }
}
