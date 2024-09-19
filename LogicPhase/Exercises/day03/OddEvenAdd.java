package logicphase.exercises.day03;

import java.util.ArrayList;
import java.util.Scanner;

public class OddEvenAdd {
  public static ArrayList<String> getOperations(int n) {
    ArrayList<String> operationsArr = new ArrayList<>();

    int num1 = 1,
        num2 = 2;
    for (int i = 0; i < n; i++) {
      operationsArr.add(num1 + " + " + num2 + " = " + (num1 + num2));
      num1 += 2;
      num2 += 2;
    }
    return operationsArr;
  }

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    while (true) {
      System.out.println("Masukkan jumlah operasi hingga ke-n: ");
      Integer input = scanner.nextInt();

      if (input.equals(-1)) {
        System.out.println("Keluar program");
        break;
      }

      System.out.println("=== Berikut operasi nya ===");
      for (String operation : getOperations(input)) {
        System.out.println(operation);
      }
    }

    scanner.close();
  }
}
