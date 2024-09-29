package dev.sch39.bootcamp.logicphase.day02;

import java.util.Scanner;

public class Factorial {
  public static int getFactorial(int num) {
    if (num < 0) {
      throw new IllegalArgumentException("Number must be positive value");
    }
    if (num == 0) {
      return 1;
    }

    return (num * getFactorial(num - 1));
  }

  public static void main(String[] args) {
    Scanner scannerObj = new Scanner(System.in);
    int input = 0;

    while (true) {
      System.out.println("Masukkan angka (masukan -1 untuk keluar): ");
      input = scannerObj.nextInt();

      if (input == -1) {
        System.out.println("Keluar program");
        break;
      }

      System.out.println("Hasil factorial: " + getFactorial(input));
    }

    scannerObj.close();
  }
}
