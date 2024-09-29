package dev.sch39.bootcamp.logicphase.day04;

import java.util.Scanner;

public class MatrixIndexPattern {
  public static String getPattern(int n) {
    return getPattern(n, n);
  }

  public static String getPattern(int row, int column) {
    String pattern = "";
    for (int i = 0; i < row; i++) {
      for (int j = 0; j < column; j++) {
        pattern += String.valueOf(i) + String.valueOf(j);
        if (j < column - 1) {
          pattern += " ";
        }
      }

      if (i < row - 1) {
        pattern += "\n";
      }
    }
    return pattern;
  }

  public static String getStartPattern(int row, int column) {
    String pattern = "";
    for (int i = 0; i < row; i++) {
      for (int j = 0; j < column; j++) {
        pattern += "*";
        if (j < column - 1) {
          pattern += " ";
        }
      }

      if (i < row - 1) {
        pattern += "\n";
      }
    }
    return pattern;
  }

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    while (true) {
      System.out.println("Masukkan baris bintang(masukan angka minus untuk keluar): ");
      Integer row = scanner.nextInt();

      if (row < 0) {
        System.out.println("Keluar program");
        break;
      }

      System.out.println("Masukkan kolom bintang(masukan angka minus untuk keluar): ");
      Integer column = scanner.nextInt();

      if (column < 0) {
        System.out.println("Keluar program");
        break;
      }

      System.out.println("Hasil pattern:");
      System.out.println(getStartPattern(row, column));
    }

    scanner.close();
  }
}
