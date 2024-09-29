package dev.sch39.bootcamp.logicphase.day05;

public class RectPattern {
  public static String[][] getPattern(int size) {
    String[][] pattern = new String[size][size];

    for (int i = 0; i < size; i++) {
      for (int j = 0; j < size; j++) {
        if (i == 0 || i == size - 1) {
          pattern[i][j] = "*";
        } else if (j == 0 || j == size - 1) {
          pattern[i][j] = "*";
        } else {
          pattern[i][j] = " ";
        }
      }
    }

    return pattern;
  }
}
