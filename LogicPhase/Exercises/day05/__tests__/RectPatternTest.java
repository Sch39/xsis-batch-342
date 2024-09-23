package logicphase.exercises.day05.__tests__;

import static org.junit.Assert.assertArrayEquals;

import org.junit.Test;

import logicphase.exercises.day05.RectPattern;

public class RectPatternTest {
  @Test
  public void it_should_return_array_with_correct_value() {
    String[][] expected1 = {
        { "*", "*", "*", "*" },
        { "*", " ", " ", "*" },
        { "*", " ", " ", "*" },
        { "*", "*", "*", "*" },
    };
    String[][] expected2 = {
        { "*", "*", "*", "*", "*" },
        { "*", " ", " ", " ", "*" },
        { "*", " ", " ", " ", "*" },
        { "*", " ", " ", " ", "*" },
        { "*", "*", "*", "*", "*" },
    };

    assertArrayEquals(expected1, RectPattern.getPattern(4));
    assertArrayEquals(expected2, RectPattern.getPattern(5));
  }
}
