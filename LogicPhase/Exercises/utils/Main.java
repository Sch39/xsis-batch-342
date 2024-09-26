package logicphase.exercises.utils;

import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    ScannerTypeCheck typeCheck = new ScannerTypeCheck(scanner);

    while (true) {
      Integer num1 = typeCheck.checkInput(() -> {
        System.out.println("Masukkan angka pertama: ");
        return scanner.nextInt();
      }, "Input tidak valid!");

      if (num1 < 0) {
        System.out.println("Keluar program!");
        break;
      }
      // Output hasil
      System.out.println("Angka pertama yang dimasukkan: " + num1);
    }

    scanner.close();
  }
}
