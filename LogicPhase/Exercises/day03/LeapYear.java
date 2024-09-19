package logicphase.exercises.day03;

import java.time.Year;
import java.util.ArrayList;
import java.util.Scanner;

public class LeapYear {
  public static ArrayList<Integer> getYear(int startYear) {
    int currentYear = Year.now().getValue();
    if (startYear > currentYear) {
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
