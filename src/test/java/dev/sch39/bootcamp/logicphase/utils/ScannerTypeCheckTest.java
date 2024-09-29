package dev.sch39.bootcamp.logicphase.utils;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

import java.util.Scanner;
import java.util.concurrent.Callable;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

@Tag("utils")
public class ScannerTypeCheckTest {
  private Scanner mockScanner;
  private ScannerTypeCheck scannerTypeCheck;

  @BeforeEach
  void setUp() {
    mockScanner = mock(Scanner.class);
    scannerTypeCheck = new ScannerTypeCheck(mockScanner);
  }

  @Test
  void testCheckInputSuccessfull() throws Exception {
    String inputInstruction = "Enter a number:";
    String invalidMessage = "Invalid input, please try again.";
    Callable<Integer> callable = () -> 5;

    Integer result = scannerTypeCheck.checkInput(callable, inputInstruction, invalidMessage);

    assertEquals(5, result);
  }

}
