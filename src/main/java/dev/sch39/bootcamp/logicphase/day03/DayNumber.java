package dev.sch39.bootcamp.logicphase.day03;

import java.util.Scanner;

public class DayNumber {
  public static Integer getNumber(String dayName) {
    if (dayName == null) {
      return null;
    }
    switch (dayName) {
      case "senin":
        return 1;
      case "selasa":
        return 2;
      case "rabu":
        return 3;
      case "kamis":
        return 4;
      case "jum'at":
        return 5;
      case "sabtu":
        return 6;
      case "minggu":
        return 7;
      default:
        return null;
    }
  }

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    while (true) {
      System.out.println("Masukkan nama hari: ");
      String input = scanner.nextLine();

      if (input.equals("-1")) {
        System.out.println("Keluar program");
        break;
      }

      System.out.println("Hari ke-: " + getNumber(input));
    }

    scanner.close();
  }
}
