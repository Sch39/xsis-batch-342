package logicphase.exercises.day05.__tests__;

import static org.junit.Assert.assertArrayEquals;

import org.junit.Test;

import logicphase.exercises.day05.MatrixPattern;

public class MatrixPatternTest {
  @Test
  public void it_should_return_matrix_with_number_high_to_low() {
    Integer[][] expected1 = {
        { 4, 3 },
        { 2, 1 },
    };
    Integer[][] expected2 = {
        { 9, 8, 7 },
        { 6, 5, 4 },
        { 3, 2, 1 },
    };

    assertArrayEquals(expected1, MatrixPattern.getBig2SmallPattern(2));
    assertArrayEquals(expected2, MatrixPattern.getBig2SmallPattern(3));
  }

  @Test
  public void it_should_return_matrix_with_odd_even_pattern() {
    Integer[][] expexted1 = {
        { 1, 3, 5 },
        { 2, 4, 6 },
        { 7, 9, 11 },
    };
    Integer[][] expexted2 = {
        { 1, 3, 5, 7 },
        { 2, 4, 6, 8 },
        { 9, 11, 13 },
        { 10, 12, 14 },
    };

    assertArrayEquals(expexted1, MatrixPattern.getOddEvenPattern(3));
    assertArrayEquals(expexted2, MatrixPattern.getOddEvenPattern(4));
  }
}
