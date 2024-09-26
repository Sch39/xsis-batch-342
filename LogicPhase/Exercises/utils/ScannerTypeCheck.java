package logicphase.exercises.utils;

import java.util.Scanner;
import java.util.concurrent.Callable;

public class ScannerTypeCheck {
  private Scanner scanner;

  public ScannerTypeCheck(Scanner scanner) {
    this.scanner = scanner;
  }

  public <T> T checkInput(Callable<T> callback, String customInvalidMessage) {
    while (true) {
      try {
        return callback.call();
      } catch (Exception e) {
        System.out.println(customInvalidMessage);
      }
      this.scanner.nextLine();
    }
  }
}
