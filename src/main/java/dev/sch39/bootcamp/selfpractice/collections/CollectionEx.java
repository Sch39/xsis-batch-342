package dev.sch39.bootcamp.selfpractice.collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CollectionEx {
  public static void main(String[] args) {
    // Collection<String> names = new ArrayList<>(List.of("a", "b", "c", "d"));
    // Iterator<String> iterator = names.iterator();

    // System.out.println("with iterator");
    // while (iterator.hasNext()) {
    // System.out.println(iterator.next());
    // }
    // names.remove("a");

    // System.out.println("with foreach");
    // for (String name : names) {
    // System.out.println(name);
    // }

    // System.out.println("is contain b: " + names.contains("b"));
    // System.out.println("is contain z: " + names.contains("z"));
    // System.out.println(commonTwo(new String[] { "a", "c", "x" }, new String[] {
    // "b", "c", "d", "x" }));
    // String str = "fgdfd";
    // new StringBuilder(str).deleteCharAt(0).toString()
    List<String> names2 = new ArrayList<>(List.of("a", "b", "c", "d"));
    Integer[] arr = { 5, 2, 1, 8, 10 };
    Arrays.sort(arr, Collections.reverseOrder()); // desc
    System.out.println(arr[0]);
    Collections.sort(names2);
    System.out.println(names2);
    Collections.sort(names2, Collections.reverseOrder());
    System.out.println(names2);
  }

  public static int commonTwo(String[] a, String[] b) {
    Map<String, Integer> prefixSum = new HashMap<>();

    for (int i = 1; i < a.length; i++) {
      if (!a[i].equals(a[i - 1])) {
        for (int j = 1; j < b.length; j++) {
          if (b[i].equals(b[i - 1])) {
            if (a[i].equals(b[j])) {
              prefixSum.put(a[i - 1], prefixSum.get(a[i - 1]) != null ? (prefixSum.get(a[i - 1]) + 1) : 1);
            }
          } else if (j == b.length - 1) {
            prefixSum.put(a[i - 1], prefixSum.get(a[i - 1]) != null ? (prefixSum.get(a[i - 1]) + 1) : 1);
          }
        }
      } else if (i == a.length - 1) {
        for (int j = 1; j < b.length; j++) {
          if (b[i].equals(b[i - 1])) {
            if (a[i].equals(b[j])) {
              prefixSum.put(a[i - 1], prefixSum.get(a[i - 1]) != null ? (prefixSum.get(a[i - 1]) + 1) : 1);
            }
          } else if (j == b.length - 1) {
            prefixSum.put(a[i - 1], prefixSum.get(a[i - 1]) != null ? (prefixSum.get(a[i - 1]) + 1) : 1);
          }
        }
      }
    }
    int counter = 0;
    for (Map.Entry<String, Integer> set : prefixSum.entrySet()) {
      counter += set.getValue();
      // set.get
    }
    System.out.println(prefixSum);
    return counter;
  }

  public static List<Integer> noNeg(List<Integer> nums) {
    for (int i = 0; i < nums.size(); i++) {
      if (nums.get(i) < 0) {
        nums.remove(i);
      }
    }

    return nums;
  }

}
