package logicphase.exercises.day02.__tests__;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import logicphase.exercises.day02.MaxFromFourNumber;

public class MaxFromFourNumberTest {
  @Test
  public void it_should_return_min_max_with_normies_values() {
    int[] numbers = { 3, 5, 7, 2 };
    String expected = "min: 2\nmax: 7";
    String actual = MaxFromFourNumber.getMinMax(numbers);
    assertEquals(expected, actual);
  }

  @Test
  public void it_should_return_min_max_with_negative_values() {
    int[] numbers = { -10, -5, 0, 5 };
    String expected = "min: -10\nmax: 5";
    String actual = MaxFromFourNumber.getMinMax(numbers);
    assertEquals(expected, actual);
  }

  @Test
  public void it_should_return_min_max_with_all_equal_values() {
    int[] numbers = { 4, 4, 4, 4 };
    String expected = "min: 4\nmax: 4";
    String actual = MaxFromFourNumber.getMinMax(numbers);
    assertEquals(expected, actual);
  }

  @Test
  public void it_should_return_min_max_with_single_value() {
    int[] numbers = { 42 };
    String expected = "min: 42\nmax: 42";
    String actual = MaxFromFourNumber.getMinMax(numbers);
    assertEquals(expected, actual);
  }
}
