package logicphase.exercises.day02.__tests__;

import static org.junit.Assert.assertArrayEquals;

import org.junit.Test;

import logicphase.exercises.day02.Matrix;

public class MatrixTest {
  @Test
  public void it_should_return_correct_array_2d() {
    int[][] expected1 = {
        { 1, 2 },
        { 1, 2 },
    };
    int[][] expected2 = {
        { 1, 2, 3 },
        { 1, 2, 3 },
        { 1, 2, 3 },
    };
    int[][] expected3 = {
        { 1, 2, 3, 4 },
        { 1, 2, 3, 4 },
        { 1, 2, 3, 4 },
        { 1, 2, 3, 4 },
    };

    assertArrayEquals(expected1, Matrix.getArr2d(2));

    assertArrayEquals(expected2, Matrix.getArr2d(3));
    assertArrayEquals(expected3, Matrix.getArr2d(4));
  }
}
