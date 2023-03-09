package chapter2;

public class Main1 {
  public static void main(String[] args) {
    Pocket1 p = new Pocket1();
    p.put("1192");
    String s = (String) p.get();
    System.out.println(s);
  }
}
