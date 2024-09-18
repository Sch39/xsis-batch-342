package logicphase.exercises.day02.__tests__;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;

import org.junit.Test;

import logicphase.exercises.day02.Fibonaci;

public class FibonaciTest {
  @Test
  public void it_return_array_with_correct_sequence_value() {
    int[] expected1 = { 0, 1, 1, 2, 3 };
    int[] result1 = Fibonaci.getFibonaci(5);
    assertArrayEquals(expected1, result1);

    // Test 2: Fibonaci dengan 1 angka
    int[] expected2 = { 0 };
    int[] result2 = Fibonaci.getFibonaci(1);
    assertArrayEquals(expected2, result2);

    // Test 3: Fibonaci dengan 0 angka
    int[] expected3 = {};
    int[] result3 = Fibonaci.getFibonaci(0);
    assertArrayEquals(expected3, result3);

    // Test 4: Fibonaci dengan 10 angka
    int[] expected4 = { 0, 1, 1, 2, 3, 5, 8, 13, 21, 34 };
    int[] result4 = Fibonaci.getFibonaci(10);
    assertArrayEquals(expected4, result4);
  }
}
