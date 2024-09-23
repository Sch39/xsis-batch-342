package logicphase.exercises.day05.__tests__;

import static org.junit.Assert.assertArrayEquals;

import org.junit.Test;

import logicphase.exercises.day05.DiagonalPattern;

public class DiagonalPatternTest {
  @Test
  public void it_should_return_array_with_correct_pattern() {
    String[][] expected1 = {
        { "*", " ", "*" },
        { " ", "*", " " },
        { "*", " ", "*" },
    };

    assertArrayEquals(expected1, DiagonalPattern.getPattern(3));
  }
}
