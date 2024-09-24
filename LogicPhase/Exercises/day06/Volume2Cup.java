package logicphase.exercises.day06;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Volume2Cup {
  public static Double getCup(int volume, String container) {
    Double result;
    // Ratio x:cup
    Double factorGlass = 2.5;
    Double factorBottle = factorGlass * 2;
    Double factorTeapot = 25.0;
    switch (container) {
      case "glass":
        result = volume * factorGlass;
        break;
      case "teapot":
        result = volume * factorTeapot;
        break;
      case "bottle":
        result = volume * factorBottle;
        break;
      default:
        result = null;
        break;
    }

    return result;
  }

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    while (true) {
      List<String> containerArr = new ArrayList<>(List.of("bottle", "glass", "teapot"));
      System.out.println("Masukkan jenis wadah[0:bottle, 1:glass, 2:teapot]: ");
      Integer containerIndex = scanner.nextInt();
      if (containerIndex >= containerArr.size()) {
        continue;
      }
      System.out.println("Masukkan jumlah volume: ");
      Integer volume = scanner.nextInt();

      if (containerIndex < 0 || volume < 0) {
        System.out.println("Keluar program");
        break;
      }

      System.out.println("====== Hasil =====");
      System.out.println(
          volume + " " + containerArr.get(containerIndex) + " = " + getCup(volume, containerArr.get(containerIndex))
              + " cup");
    }

    scanner.close();
  }
}
