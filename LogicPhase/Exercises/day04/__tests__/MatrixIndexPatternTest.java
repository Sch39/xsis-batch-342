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

  @Test
  public void it_should_return_string_pattern_when_input_positive_row_and_column() {
    String expected1 = "00 01\n10 11\n20 21";
    String expected2 = "00 01 02 03 04\n10 11 12 13 14\n20 21 22 23 24\n30 31 32 33 34";

    assertEquals(expected1, MatrixIndexPattern.getPattern(3, 2));
    assertEquals(expected2, MatrixIndexPattern.getPattern(4, 5));
  }

  @Test
  public void it_should_return_start_string_pattern_when_input_positive_row_and_column() {
    String expected1 = "* *\n* *\n* *";
    String expected2 = "* * * * *\n* * * * *\n* * * * *\n* * * * *";

    assertEquals(expected1, MatrixIndexPattern.getStartPattern(3, 2));
    assertEquals(expected2, MatrixIndexPattern.getStartPattern(4, 5));
  }
}
