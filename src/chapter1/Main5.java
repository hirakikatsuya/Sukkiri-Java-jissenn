package chapter1;

import java.util.*;

public class Main5 {
  public static void main(String[] args) {
    List<Account> list = new ArrayList<Account>();
    Account a1 = new Account();
    a1.number = 9;
    a1.zandaka = 10000;
    Account a2 = new Account();
    a2.number = 15;
    a2.zandaka = 20000;
    Account a3 = new Account();
    a3.number = 12;
    a3.zandaka = 1000;
    list.add(a1);
    list.add(a2);
    list.add(a3);
    Collections.sort(list);
    System.out.println(list);
    Collections.sort(list, new ZandakaComparator());
    System.out.println(list);
  }
}
