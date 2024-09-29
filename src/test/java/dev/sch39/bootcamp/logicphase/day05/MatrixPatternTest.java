package dev.sch39.bootcamp.logicphase.day05;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

@Tag("day05")
public class MatrixPatternTest {
  @Test
  void testGetBig2SmallPattern() {
    Integer[][] expected = {
        { 9, 8, 7 },
        { 6, 5, 4 },
        { 3, 2, 1 }
    };
    Integer[][] actual = MatrixPattern.getBig2SmallPattern(3);
    assertArrayEquals(expected, actual);
  }

  @Test
  void testGetBig2SmallPatternSize4() {
    Integer[][] expected = {
        { 16, 15, 14, 13 },
        { 12, 11, 10, 9 },
        { 8, 7, 6, 5 },
        { 4, 3, 2, 1 }
    };
    Integer[][] actual = MatrixPattern.getBig2SmallPattern(4);
    assertArrayEquals(expected, actual);
  }

  @Test
  void testGetOddEvenPattern() {
    Integer[][] expected = {
        { 1, 3, 5 },
        { 2, 4, 6 },
        { 7, 9, 11 }
    };
    Integer[][] actual = MatrixPattern.getOddEvenPattern(3);
    assertArrayEquals(expected, actual);
  }

  @Test
  void testGetOddEvenPatternSize4() {
    Integer[][] expected = {
        { 1, 3, 5, 7 },
        { 2, 4, 6, 8 },
        { 9, 11, 13, 15 },
        { 10, 12, 14, 16 }
    };
    Integer[][] actual = MatrixPattern.getOddEvenPattern(4);
    assertArrayEquals(expected, actual);
  }
}
