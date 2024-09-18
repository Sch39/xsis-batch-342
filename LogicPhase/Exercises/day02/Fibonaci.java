package logicphase.exercises.day02;

import java.util.Scanner;

public class Fibonaci {
  public static int[] getFibonaci(int n) {
    int[] arr = new int[n];
    int num1 = 0, num2 = 1;

    for (int i = 0; i < n; i++) {
      arr[i] = num1;
      int num3 = num2 + num1;
      num1 = num2;
      num2 = num3;
    }
    return arr;
  }

  public static void main(String[] args) {
    Scanner scannerObj = new Scanner(System.in);
    int input = 0;

    while (true) {
      System.out.println("Masukkan panjang deret (masukan -1 untuk keluar): ");
      input = scannerObj.nextInt();

      if (input == -1) {
        System.out.println("Keluar program");
        break;
      }
      int[] fibonaciArr = getFibonaci(input);

      System.out.println("Deret fibonaci");
      for (int i : fibonaciArr) {

        System.out.print(i + " ");
      }
      System.out.println();
    }

    scannerObj.close();
  }
}
