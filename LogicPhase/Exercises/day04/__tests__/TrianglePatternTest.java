package logicphase.exercises.day04.__tests__;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import logicphase.exercises.day04.TrianglePattern;

public class TrianglePatternTest {
  @Test
  public void it_should_return_triangle_pattern_with_number_and_left_align() {
    String expected1 = "1  \n12 \n123";
    String expected2 = "1   \n12  \n123 \n1234";
    assertEquals(expected1, TrianglePattern.getPattern(3));
    assertEquals(expected2, TrianglePattern.getPattern(4));
  }

  @Test
  public void it_should_return_triangle_pattern_with_number_and_right_align() {
    String expected1 = "  1\n 12\n123";
    String expected2 = "   1\n  12\n 123\n1234";
    assertEquals(expected1, TrianglePattern.getPattern(3, "right"));
    assertEquals(expected2, TrianglePattern.getPattern(4, "right"));
  }

  @Test
  public void it_should_return_triangle_pattern_with_star_and_left_align() {
    String expected1 = "*  \n** \n***";
    String expected2 = "*   \n**  \n*** \n****";
    assertEquals(expected1, TrianglePattern.getPattern(3, "left", "*"));
    assertEquals(expected2, TrianglePattern.getPattern(4, "left", "*"));
  }

  @Test
  public void it_should_return_triangle_pattern_with_star_and_right_align() {
    String expected1 = "  *\n **\n***";
    String expected2 = "   *\n  **\n ***\n****";
    assertEquals(expected1, TrianglePattern.getPattern(3, "right", "*"));
    assertEquals(expected2, TrianglePattern.getPattern(4, "right", "*"));
  }
}
