package dev.sch39.bootcamp.logicphase.day04;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

@Tag("day04")
public class TrianglePatternTest {
  @Test
  public void testGetPatternLeftDefault() {
    String expected = "1  \n12 \n123";
    assertEquals(expected, TrianglePattern.getPattern(3));
  }

  @Test
  public void testGetPatternRightDefault() {
    String expected = "  1\n 12\n123";
    assertEquals(expected, TrianglePattern.getPattern(3, "right"));
  }

  @Test
  public void testGetPatternLeftCustomPattern() {
    String expected = "*  \n** \n***";
    assertEquals(expected, TrianglePattern.getPattern(3, "left", "*"));
  }

  @Test
  public void testGetPatternRightCustomPattern() {
    String expected = "  *\n **\n***";
    assertEquals(expected, TrianglePattern.getPattern(3, "right", "*"));
  }

  @Test
  public void testGetPatternInvalidAlign() {
    String expected = "1  \n12 \n123";
    assertEquals(expected, TrianglePattern.getPattern(3, "invalid"));
  }

  @Test
  public void testGetPatternZeroSize() {
    String expected = "";
    assertEquals(expected, TrianglePattern.getPattern(0));
  }

  @Test
  public void testGetPatternNegativeSize() {
    String expected = "";
    assertEquals(expected, TrianglePattern.getPattern(-1));
  }
}
