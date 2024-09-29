package dev.sch39.bootcamp.logicphase.day02;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

@Tag("day02")
public class FibonacciTest {
  @Test
  void testGetFibonaci() {
    // Test with n = 1
    int[] expected1 = { 0 };
    assertArrayEquals(expected1, Fibonacci.getFibonaci(1));

    // Test with n = 2
    int[] expected2 = { 0, 1 };
    assertArrayEquals(expected2, Fibonacci.getFibonaci(2));

    // Test with n = 5
    int[] expected5 = { 0, 1, 1, 2, 3 };
    assertArrayEquals(expected5, Fibonacci.getFibonaci(5));

    // Test with n = 10
    int[] expected10 = { 0, 1, 1, 2, 3, 5, 8, 13, 21, 34 };
    assertArrayEquals(expected10, Fibonacci.getFibonaci(10));

    // Test with n = 0 (edge case)
    int[] expected0 = {};
    assertArrayEquals(expected0, Fibonacci.getFibonaci(0));
  }
}
