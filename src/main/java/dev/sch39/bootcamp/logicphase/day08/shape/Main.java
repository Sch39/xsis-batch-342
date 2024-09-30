package dev.sch39.bootcamp.logicphase.day08.shape;

import java.util.Scanner;

import dev.sch39.bootcamp.logicphase.day08.shape.Impl.CircleImpl;
import dev.sch39.bootcamp.logicphase.day08.shape.Impl.ParallelogramImpl;
import dev.sch39.bootcamp.logicphase.day08.shape.Impl.RectImpl;
import dev.sch39.bootcamp.logicphase.day08.shape.Impl.SquareImpl;
import dev.sch39.bootcamp.logicphase.day08.shape.Impl.TriangleImpl;
import dev.sch39.bootcamp.logicphase.utils.ScannerTypeCheck;

public class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    ScannerTypeCheck scannerTypeCheck = new ScannerTypeCheck(scanner);

    outerloop: while (true) {
      Integer selectedChoice;

      while (true) {
        selectedChoice = scannerTypeCheck.checkInput(() -> {
          return scanner.nextInt();
        }, "Pilih operasi: \n1. Persegi\n2. Persegi Panjang \n3. Segitiga \n4. Lingkaran \n5. Jajar Genjang",
            "\nInput invalid!\n");

        if (selectedChoice.equals(6)) {
          break outerloop;
        } else if (selectedChoice.equals(1)
            || selectedChoice.equals(2)
            || selectedChoice.equals(3)
            || selectedChoice.equals(4)
            || selectedChoice.equals(5)) {
          break;
        }

        System.out.println("=== Pilihan tidak tersedia! ===");
      }
      String invalidMessage = "Harus berupa angka!";

      if (selectedChoice.equals(1)) {
        SquareImpl squareImpl = new SquareImpl();
        Double sideLength = scannerTypeCheck.checkInput(() -> {
          return scanner.nextDouble();
        }, "Masukan Panjang Sisi: ", invalidMessage);

        squareImpl.setSide(sideLength);

        System.out.println("Luas: " + squareImpl.getArea());
        System.out.println("Keliling: " + squareImpl.getCircumference());
        System.out.println("\n");
      } else if (selectedChoice.equals(2)) {
        RectImpl rectImpl = new RectImpl();

        rectImpl.setHorizontalSide(scannerTypeCheck.checkInput(() -> {
          return scanner.nextDouble();
        }, "Masukan Panjang: ", invalidMessage));
        rectImpl.setVerticalSide(scannerTypeCheck.checkInput(() -> {
          return scanner.nextDouble();
        }, "Masukan Lebar: ", invalidMessage));

        System.out.println("Luas: " + rectImpl.getArea());
        System.out.println("Keliling: " + rectImpl.getCircumference());
        System.out.println("\n");
      } else if (selectedChoice.equals(3)) {
        Boolean isSideSame;
        scanner.nextLine();
        while (true) {
          String selected = scannerTypeCheck.checkInput(() -> {
            return scanner.nextLine().trim().toLowerCase();
          }, "Apakah segitiga sama sisi? [y: iya, n: tidak]", "Input tidak valid");
          if (selected.equals("y")) {
            isSideSame = true;
            break;
          } else if (selected.equals("n")) {
            isSideSame = false;
            break;
          }
          System.out.println("\nPilihan tidak tersedia!\n");
        }
        TriangleImpl triangleImpl = new TriangleImpl(isSideSame);
        triangleImpl.setDiagonalSide(scannerTypeCheck.checkInput(() -> {
          return scanner.nextDouble();
        }, "Masukan diagonalnya: ", invalidMessage));
        triangleImpl.setHorizontalSide(scannerTypeCheck.checkInput(() -> {
          return scanner.nextDouble();
        }, "Masukan vertikalnya: ", invalidMessage));
        triangleImpl.setVerticalSide(scannerTypeCheck.checkInput(() -> {
          return scanner.nextDouble();
        }, "Masukan vertikalnya: ", invalidMessage));

        System.out.println("Luas: " + triangleImpl.getArea());
        System.out.println("Keliling: " + triangleImpl.getCircumference());
        System.out.println("\n");
      } else if (selectedChoice.equals(4)) {
        CircleImpl circleImpl = new CircleImpl();
        circleImpl.setRadius(scannerTypeCheck.checkInput(() -> {
          return scanner.nextDouble();
        }, "Masukan jari-jari lingkaran: ", invalidMessage));

        System.out.println("Luas: " + circleImpl.getArea());
        System.out.println("Keliling: " + circleImpl.getCircumference());
        System.out.println("\n");
      } else if (selectedChoice.equals(5)) {
        ParallelogramImpl parallelogramImpl = new ParallelogramImpl();
        parallelogramImpl.setVerticalSide(scannerTypeCheck.checkInput(() -> {
          return scanner.nextDouble();
        }, "Masukan sisi vertikal: ", invalidMessage));
        parallelogramImpl.setHorizontalSide(scannerTypeCheck.checkInput(() -> {
          return scanner.nextDouble();
        }, "Masukan sisi horizontal: ", invalidMessage));

        System.out.println("Luas: " + parallelogramImpl.getArea());
        System.out.println("Keliling: " + parallelogramImpl.getCircumference());
        System.out.println("\n");
      }
    }

    scanner.close();
  }

}
