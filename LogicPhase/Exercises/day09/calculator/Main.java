package logicphase.exercises.day09.calculator;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    MathematicOperator mathematicOperator = new MathematicOperator();

    outerloop: while (true) {
      mathematicOperator.setResult(0.0);

      System.out.println("Masukkan angka pertama: ");
      Double num1;
      while (true) {
        try {
          num1 = scanner.nextDouble();
          break;
        } catch (InputMismatchException e) {
          System.out.println("Input tidak valid! Masukkan angka pertama lagi: ");
          scanner.nextLine();
        }
      }
      mathematicOperator.setResult(num1);

      // Input angka kedua
      System.out.println("Masukkan angka kedua: ");
      Double num2;
      while (true) {
        try {
          num2 = scanner.nextDouble();
          break;
        } catch (InputMismatchException e) {
          System.out.println("Input tidak valid! Masukkan angka kedua lagi: ");
          scanner.nextLine();
        }
      }

      System.out.println("Pilih operasi:\n1. Tambah \n2. Kurang \n3. Bagi \n4. Kali \n5. Keluar");
      Integer selectedChoice;
      while (true) {
        try {
          selectedChoice = scanner.nextInt();

          if (selectedChoice == 1) {
            mathematicOperator.plus(num2);
            break;
          } else if (selectedChoice == 2) {
            mathematicOperator.sub(num2);
            break;
          } else if (selectedChoice == 3) {
            if (num2 == 0) {
              System.out.println("Error: Tidak dapat membagi dengan nol!");
            } else {
              mathematicOperator.divide(num2);
            }
            break;
          } else if (selectedChoice == 4) {
            mathematicOperator.mul(num2);
            break;
          } else if (selectedChoice == 5) {
            System.out.println("Menutup program");
            break outerloop;
          } else {
            System.out.println("Pilihan tidak valid! Pilih antara 1-5.");
          }

        } catch (InputMismatchException e) {
          System.out.println("Input tidak valid! Masukkan pilihan operasi (1-5): ");
        }
        scanner.nextLine();
      }

      System.out.println("Hasil operasi: " + mathematicOperator.getResult());
    }

    scanner.close();
  }
}
