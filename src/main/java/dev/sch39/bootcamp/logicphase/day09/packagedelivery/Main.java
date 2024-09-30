package dev.sch39.bootcamp.logicphase.day09.packagedelivery;

import java.util.Map;
import java.util.Scanner;

import dev.sch39.bootcamp.logicphase.day09.packagedelivery.Impl.OrderImpl;
import dev.sch39.bootcamp.logicphase.utils.ScannerTypeCheck;

public class Main {
  public static void main(String[] args) {
    OrderImpl order = new OrderImpl();
    // order.orderedInWeek(6);
    // order.orderedInMonth(25);
    // order.setNationalHoliday(26, 29);
    // System.out.println(order.estimate2Destination());

    Scanner scanner = new Scanner(System.in);
    ScannerTypeCheck scannerTypeCheck = new ScannerTypeCheck(scanner);

    while (true) {
      int dayInWeek = scannerTypeCheck.checkInput(
          () -> scanner.nextInt(),
          "Masukkan hari dalam minggu (1: Senin, 2: Selasa, ..., 7: Minggu):",
          "Input tidak valid. Silakan masukkan angka 1-7.");
      order.orderedInWeek(dayInWeek);

      int dayInMonth = scannerTypeCheck.checkInput(
          () -> scanner.nextInt(),
          "Masukkan hari dalam bulan (1-31):",
          "Input tidak valid. Silakan masukkan angka 1-31.");
      order.orderedInMonth(dayInMonth);

      System.out.println("Masukkan hari libur nasional (masukkan -1 jika selesai):");
      while (true) {
        int holiday = scannerTypeCheck.checkInput(
            () -> scanner.nextInt(),
            "Masukkan hari libur nasional (1-31):",
            "Input tidak valid. Silakan masukkan angka 1-31.");

        if (holiday == -1) {
          break;
        }
        order.setNationalHoliday(holiday);
      }

      Map<String, Integer> estimatedDelivery = order.estimate2Destination();
      String estimatedDay = order.getNameDayInWeek(estimatedDelivery.get("dayInWeek"));
      int estimatedDayInMonth = estimatedDelivery.get("dayInMonth");
      int estimatedMonthInYear = estimatedDelivery.get("monthInYear");

      System.out.println("Paket akan sampai pada hari " + estimatedDay
          + ", tanggal " + estimatedDayInMonth
          + (estimatedMonthInYear > 0 ? " di bulan depan." : "."));

      System.out.println("Apakah Anda ingin melakukan estimasi lain? (y/n):");
      String answer = scanner.next().toLowerCase();

      if (!answer.equals("ya")) {
        System.out.println("Terima kasih telah menggunakan layanan estimasi pengiriman.");
        break;
      }
    }
    scanner.close();
  }
}
