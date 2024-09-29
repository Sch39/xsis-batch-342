package dev.sch39.bootcamp.logicphase.utils;

import java.util.Scanner;
import java.util.concurrent.Callable;

public class ScannerTypeCheck {
  private Scanner scanner;

  public ScannerTypeCheck(Scanner scanner) {
    this.scanner = scanner;
  }

  public <T> T checkInput(Callable<T> callback, String inputIntruction, String customInvalidMessage) {
    while (true) {
      System.out.println(inputIntruction);
      try {
        return callback.call();
      } catch (Exception e) {
        System.out.println(customInvalidMessage);
      }
      this.scanner.nextLine();
    }
  }
}
