package logicphase.exercises.day03;

import java.util.Scanner;

public class DayName {
  public static String getName(int numDay) {
    switch (numDay) {
      case 1:
        return "senin";
      case 2:
        return "selasa";
      case 3:
        return "rabu";
      case 4:
        return "kamis";
      case 5:
        return "jum'at";
      case 6:
        return "sabtu";
      case 7:
        return "minggu";
      default:
        return "Out of range!";
    }
  }

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    while (true) {
      System.out.println("Masukkan angka hari ke-n: ");
      Integer input = scanner.nextInt();

      if (input.equals(-1)) {
        System.out.println("Keluar program");
        break;
      }

      System.out.println("Nama hari: " + getName(input));
    }

    scanner.close();
  }
}
