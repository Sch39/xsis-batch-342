package dev.sch39.bootcamp.logicphase.day04;

import java.util.Scanner;

public class TrianglePattern {
  public static String getPattern(int size) {
    return getPattern(size, "left", "number");
  }

  public static String getPattern(int size, String align) {
    if (!(align.equals("left")
        || align.equals("right"))) {
      align = "left";
    }
    return getPattern(size, align, "number");
  }

  public static String getPattern(int size, String align, String pattern) {
    String patternStr = "";
    align = align.toLowerCase();

    for (int i = 0; i < size; i++) {
      int rightNumCounter = 1;

      for (int j = 0; j < size; j++) {
        if (align.equals("left")) {
          if (j <= i) {
            if (pattern.equals("number")) {
              patternStr += String.valueOf(j + 1);
            } else {
              patternStr += pattern;
            }
          } else {
            patternStr += " ";
          }
        } else if (align.equals("right")) {
          if (j >= size - 1 - i) {
            if (pattern.equals("number")) {
              patternStr += String.valueOf(rightNumCounter);
              rightNumCounter++;
            } else {
              patternStr += pattern;
            }
          } else {
            patternStr += " ";
          }
        }
      }

      if (i < size - 1) {
        patternStr += "\n";
      }
    }

    return patternStr;
  }

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    while (true) {
      System.out.println("Masukkan ukuran input(format-> size, align, pattern): ");
      String input = scanner.next();

      String[] inputSplited = input.split(",");
      if (inputSplited[0].equals("x")) {
        System.out.println("Keluar program");
        break;
      }
      Integer size = Integer.parseInt(inputSplited[0].trim());
      String patternResult = "";

      switch (inputSplited.length) {
        case 1:
          patternResult = getPattern(size);
          break;
        case 2:
          patternResult = getPattern(size, inputSplited[1].trim());
          break;
        case 3:
          patternResult = getPattern(size, inputSplited[1].trim(), inputSplited[2].trim());
          break;
        default:
          System.out.println("Input tidak sesuai format!");
          break;
      }

      System.out.println("==========");
      System.out.println(patternResult);
    }

    scanner.close();
  }
}
