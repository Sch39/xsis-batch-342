package logicphase.exercises.utils;

import java.util.Scanner;
import java.util.concurrent.Callable;

/**
 * The {@code ScannerTypeCheck} class provides a utility for validating user
 * input using a {@link Scanner}.
 * It repeatedly prompts the user for input until a valid input is provided, as
 * determined by the provided
 * callback function.
 * 
 * @author sch39
 */
public class ScannerTypeCheck {
  private Scanner scanner;

  /**
   * Constructs a new {@code ScannerTypeCheck} instance with the specified
   * {@link Scanner}.
   *
   * @param scanner the {@code Scanner} to be used for reading user input
   */
  public ScannerTypeCheck(Scanner scanner) {
    this.scanner = scanner;
  }

  /**
   * Checks the input by executing the given {@code callback}. If an exception
   * occurs during the execution of
   * the callback, an error message is printed, and the user is prompted to enter
   * input again.
   *
   * @param <T>                  the type of the result produced by the
   *                             {@code callback}
   * @param callback             a {@link Callable} that represents the logic for
   *                             checking input
   * @param inputIntruction      a custom message to display instruction
   * 
   * @param customInvalidMessage a custom message to display when the input is
   *                             invalid
   * @return the valid input result produced by the {@code callback}
   * @throws Exception if the callback throws an exception that is not handled
   */
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
