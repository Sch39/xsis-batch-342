package logicphase.exercises.day04.__tests__;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import logicphase.exercises.day04.MatrixIndexPattern;

public class MatrixIndexPatternTest {
  @Test
  public void it_should_return_string_pattern_when_input_positive() {
    String expected1 = "00 01 02\n10 11 12\n20 21 22";
    String expected2 = "00 01 02 03\n10 11 12 13\n20 21 22 23\n30 31 32 33";

    assertEquals(expected1, MatrixIndexPattern.getPattern(3));
    assertEquals(expected2, MatrixIndexPattern.getPattern(4));
  }

  @Test
  public void it_should_return_empty_string_when_input_negative() {
    assertEquals("", MatrixIndexPattern.getPattern(-1));
    assertEquals("", MatrixIndexPattern.getPattern(-2));
  }
}
