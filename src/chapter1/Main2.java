package chapter1;

import java.util.*;

public class Main2 {
  public static void main(String[] args) {
    List<Hero> list = new ArrayList<Hero>();
    Hero h1 = new Hero();
    h1.setName("ミナト");
    list.add(h1);
    System.out.println("要素数=" + list.size());
    h1 = new Hero();
    h1.setName("ミナト");
    list.remove(h1);
    System.out.println("要素数=" + list.size());
  }
}
