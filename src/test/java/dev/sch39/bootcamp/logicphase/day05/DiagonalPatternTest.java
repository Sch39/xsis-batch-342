package dev.sch39.bootcamp.logicphase.day05;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

@Tag("day05")
public class DiagonalPatternTest {
  @Test
  public void testGetPatternSize5() {
    String[][] expected = {
        { "*", " ", " ", " ", "*" },
        { " ", "*", " ", "*", " " },
        { " ", " ", "*", " ", " " },
        { " ", "*", " ", "*", " " },
        { "*", " ", " ", " ", "*" }
    };
    assertArrayEquals(expected, DiagonalPattern.getPattern(5));
  }

  @Test
  public void testGetPatternSize3() {
    String[][] expected = {
        { "*", " ", "*" },
        { " ", "*", " " },
        { "*", " ", "*" }
    };
    assertArrayEquals(expected, DiagonalPattern.getPattern(3));
  }

  @Test
  public void testGetPatternSize1() {
    String[][] expected = {
        { "*" }
    };
    assertArrayEquals(expected, DiagonalPattern.getPattern(1));
  }

  @Test
  public void testGetPatternSize0() {
    String[][] expected = {};
    assertArrayEquals(expected, DiagonalPattern.getPattern(0));
  }
}
