package dev.sch39.bootcamp.selfpractice;

import java.util.ArrayList;
import java.util.List;

public class ListCombination {
  public static List<Integer> combination(List<Integer> l1, List<Integer> l2) {
    String l1Str = "",
        l2Str = "";
    for (int i = l1.size() - 1; i >= 0; i--) {
      l1Str += l1.get(i);
    }
    for (int i = l2.size() - 1; i >= 0; i--) {
      l2Str += l2.get(i);
    }
    String combined = String.valueOf(Integer.valueOf(l1Str)
        + Integer.valueOf(l2Str));
    List<Integer> result = new ArrayList<>();
    for (int i = combined.length() - 1; i >= 0; i--) {
      result.add(Integer.valueOf(combined.charAt(i) + ""));
    }

    return result;
  }

  public static void main(String[] args) {
    System.out.println(combination(new ArrayList<>(List.of(2, 4, 3)), new ArrayList<>(List.of(5, 6, 4))));
    System.out.println(combination(new ArrayList<>(List.of(0)), new ArrayList<>(List.of(0))));
    System.out
        .println(combination(new ArrayList<>(List.of(9, 9, 9, 9, 9, 9, 9)), new ArrayList<>(List.of(9, 9, 9, 9))));
  }
}
