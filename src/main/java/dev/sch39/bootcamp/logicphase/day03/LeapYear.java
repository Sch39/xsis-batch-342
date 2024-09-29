package dev.sch39.bootcamp.logicphase.day03;

import java.util.*;
import java.time.Year;

public class LeapYear {
  public static ArrayList<Integer> getYear(int startYear) {
    int currentYear = Year.now().getValue();
    if (startYear > currentYear || startYear < 0) {
      return new ArrayList<>();
    }

    ArrayList<Integer> leapYearArr = new ArrayList<>();
    for (int i = startYear; i <= currentYear; i++) {
      if (i % 4 == 0) {
        leapYearArr.add(i);
      }
    }

    return leapYearArr;
  }

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    while (true) {
      System.out.println("Masukkan tahun mulai(masukan angka minus untuk keluar): ");
      Integer input = scanner.nextInt();

      if (input < 0) {
        System.out.println("Keluar program");
        break;
      }

      System.out.println("Tahun kabisat: " + getYear(input));
    }

    scanner.close();
  }
}
