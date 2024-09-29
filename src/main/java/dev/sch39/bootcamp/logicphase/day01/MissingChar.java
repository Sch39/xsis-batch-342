package dev.sch39.bootcamp.logicphase.day01;

public class MissingChar {
  public static String missingChar(String str, int n) {
    return new StringBuilder(str).deleteCharAt(n).toString();
  }

  public static void main(String[] args) {
    System.out.println(missingChar("kitten", 1));
    System.out.println(missingChar("kitten", 0));
    System.out.println(missingChar("kitten", 4));
  }
}
