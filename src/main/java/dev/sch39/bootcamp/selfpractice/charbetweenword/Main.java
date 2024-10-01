package dev.sch39.bootcamp.selfpractice.charbetweenword;

public class Main {
  public static String getSandwich(String str) {
    String word = "bread";
    Integer finded1 = null,
        finded2 = null;

    for (int i = 0; i < str.length() - word.length() + 1; i++) {
      if (finded1 == null
          && str.substring(i, i + word.length()).equals(word)) {
        finded1 = i;
      } else if (finded2 == null
          && str.substring(i, i + word.length()).equals(word)) {
        finded2 = i;
      }
    }
    if (finded1 == null
        || finded2 == null) {
      return "";
    }
    return str.substring(finded1 + word.length(), finded2);
  }

  public static void main(String[] args) {
    System.out.println("Hasil: " + getSandwich("breadjambread"));
    System.out.println("Hasil: " + getSandwich("fsdfgrgtbreadlmbread"));
    System.out.println("Hasil: " + getSandwich("fsdfgrgtbreadlm"));
  }

}
