package dev.sch39.bootcamp.logicphase.day04;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

@Tag("day04")
public class MatrixIndexPatternTest {
  @Test
  public void testGetPattern() {
    assertEquals("00 01\n10 11", MatrixIndexPattern.getPattern(2));
    assertEquals("00 01 02\n10 11 12", MatrixIndexPattern.getPattern(2, 3));
    assertEquals("", MatrixIndexPattern.getPattern(0));
  }

  @Test
  public void testGetStartPattern() {
    assertEquals("* *\n* *", MatrixIndexPattern.getStartPattern(2, 2));
    assertEquals("* * *\n* * *", MatrixIndexPattern.getStartPattern(2, 3));
    assertEquals("", MatrixIndexPattern.getStartPattern(0, 0));
  }
}
