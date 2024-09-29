package dev.sch39.bootcamp.logicphase.day05;

public class DiagonalPattern {
  public static String[][] getPattern(int size) {
    String[][] pattern = new String[size][size];
    for (int i = 0; i < size; i++) {
      for (int j = 0; j < size; j++) {
        if (i == j) {
          pattern[i][j] = "*";
        } else if (j == size - 1 - i) {
          pattern[i][j] = "*";
        } else {
          pattern[i][j] = " ";
        }
      }
    }
    return pattern;
  }

  public static void main(String[] args) {
    for (String[] strs : getPattern(5)) {
      for (String str : strs) {
        System.out.print(str);
      }
      System.out.println();
    }
  }
}
