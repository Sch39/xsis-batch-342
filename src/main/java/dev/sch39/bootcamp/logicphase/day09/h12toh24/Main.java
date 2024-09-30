package dev.sch39.bootcamp.logicphase.day09.h12toh24;

import java.util.Scanner;

import dev.sch39.bootcamp.logicphase.day09.h12toh24.Impl.TimeConverterImpl;
import dev.sch39.bootcamp.logicphase.utils.ScannerTypeCheck;

public class Main {
  public static void main(String[] args) {
    Time timeConverter = new TimeConverterImpl();
    // System.out.println(timeConverter.convertTime("12:35 AM"));
    // System.out.println(timeConverter.convertTime("19:30"));
    // System.out.println(timeConverter.convertTime("09:05"));
    // System.out.println(timeConverter.convertTime("11:30 PM"));
    Scanner scanner = new Scanner(System.in);
    ScannerTypeCheck scannerTypeCheck = new ScannerTypeCheck(scanner);

    outerloop: while (true) {
      String input = scannerTypeCheck.checkInput(() -> scanner.nextLine(),
          "Masukkan waktu dalam format 12h atau 24h (contoh: 07:45 AM atau 19:30) atau ketik 'x' untuk keluar:",
          "Input tidak valid. Silakan coba lagi.");

      if (input.equalsIgnoreCase("x")) {
        System.out.println("keluar Time Converter!");
        break outerloop;
      }

      try {
        String convertedTime = timeConverter.convertTime(input);
        System.out.println("Waktu yang telah dikonversi: " + convertedTime);
      } catch (IllegalArgumentException e) {
        System.out.println("Format waktu tidak valid. Silakan coba lagi !!!");
      }
    }

    scanner.close();
  }
}
