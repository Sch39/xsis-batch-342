package dev.sch39.bootcamp.logicphase.day02;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

@Tag("day02")
public class MatrixTest {
  @Test
  public void testGetArr2d_Size3() {
    int[][] expected = {
        { 1, 2, 3 },
        { 1, 2, 3 },
        { 1, 2, 3 }
    };
    int[][] result = Matrix.getArr2d(3);
    assertArrayEquals(expected, result);
  }

  @Test
  public void testGetArr2d_Size1() {
    int[][] expected = {
        { 1 }
    };
    int[][] result = Matrix.getArr2d(1);
    assertArrayEquals(expected, result);
  }

  @Test
  public void testGetArr2d_Size0() {
    int[][] result = Matrix.getArr2d(0);
    assertEquals(0, result.length);
  }

  @Test
  public void testGetArr2d_SizeNegative() {
    Exception exception = assertThrows(NegativeArraySizeException.class, () -> {
      Matrix.getArr2d(-1);
    });
    String expectedMessage = "Negative array size";
    String actualMessage = exception.getMessage();
    assertTrue(actualMessage.contains(expectedMessage));
  }
}
