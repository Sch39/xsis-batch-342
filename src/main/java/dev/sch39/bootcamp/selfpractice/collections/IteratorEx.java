package dev.sch39.bootcamp.selfpractice.collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class IteratorEx {
  public static void main(String[] args) {
    List<String> names = new ArrayList<>(List.of("a", "b", "c", "d", "e"));
    Iterator<String> iterator = names.iterator();
    while (iterator.hasNext()) {
      System.out.println(iterator.next()); // menambah iterasi
      // System.out.println("hello"); // infinite loop karena iterasi tidak bertambah
    }
  }
}
