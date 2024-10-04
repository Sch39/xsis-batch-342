package dev.sch39.bootcamp.selfpractice.copies;

import java.util.ArrayList;
import java.util.List;

public class Main {
  public static List<String> copies3(List<String> strings) {
    for (int i = 0; i < strings.size(); i++) {
      // strings.set(i, strings.get(i).repeat(3));
      strings.set(i, new String(new char[3]).replace("\0", strings.get(i)));
    }

    return strings;
  }

  public static void main(String[] args) {
    List<String> input1 = new ArrayList<>(List.of("a", "bb", "ccc"));
    System.out.println(copies3(input1));
  }
}
