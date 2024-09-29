package dev.sch39.bootcamp.logicphase.day05;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

@Tag("day05")
public class RectPatternTest {
  @Test
  public void testGetPatternSize3() {
    String[][] expected = {
        { "*", "*", "*" },
        { "*", " ", "*" },
        { "*", "*", "*" }
    };

    String[][] result = RectPattern.getPattern(3);
    assertArrayEquals(expected, result);
  }

  @Test
  public void testGetPatternSize5() {
    String[][] expected = {
        { "*", "*", "*", "*", "*" },
        { "*", " ", " ", " ", "*" },
        { "*", " ", " ", " ", "*" },
        { "*", " ", " ", " ", "*" },
        { "*", "*", "*", "*", "*" }
    };

    String[][] result = RectPattern.getPattern(5);
    assertArrayEquals(expected, result);
  }

  @Test
  public void testGetPatternSize1() {
    String[][] expected = {
        { "*" }
    };

    String[][] result = RectPattern.getPattern(1);
    assertArrayEquals(expected, result);
  }

  @Test
  public void testGetPatternSize0() {
    String[][] expected = new String[0][0];

    String[][] result = RectPattern.getPattern(0);
    assertArrayEquals(expected, result);
  }
}
