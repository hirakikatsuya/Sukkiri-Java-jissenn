package chapter2;

public class Main2 {
  public static void main(String[] args) {
    Pocket2<String> p = new Pocket2<>();
    p.put("1192");
    String s = p.get();
    System.out.println(s);
  }
}
