package dev.sch39.bootcamp.logicphase.day02;

import java.util.Scanner;

public class Matrix {
  public static int[][] getArr2d(int n) {
    if (n < 0) {
      throw new NegativeArraySizeException("Negative array size given!");
    }
    int[][] matrix2d = new int[n][n];

    for (int i = 0; i < n; i++) {
      for (int j = 0; j < n; j++) {
        matrix2d[i][j] = j + 1;
      }
    }
    return matrix2d;
  }

  public static void main(String[] args) {
    Scanner scannerObj = new Scanner(System.in);
    int input = 0;

    while (true) {
      System.out.println("Masukkan ukuran matrix (masukan -1 untuk keluar): ");
      input = scannerObj.nextInt();

      if (input == -1) {
        System.out.println("Keluar program");
        break;
      }
      int[][] metrix2d = getArr2d(input);

      System.out.println("Matrix");
      for (int i = 0; i < input; i++) {
        for (int j = 0; j < input; j++) {
          System.out.print(metrix2d[i][j] + " ");
        }
        System.out.println();
      }
      System.out.println();
    }

    scannerObj.close();
  }
}
