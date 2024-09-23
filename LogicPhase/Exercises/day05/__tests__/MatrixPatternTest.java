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
}
