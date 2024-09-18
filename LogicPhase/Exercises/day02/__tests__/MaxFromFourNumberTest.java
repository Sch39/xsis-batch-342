package logicphase.exercises.day02.__tests__;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import logicphase.exercises.day02.MaxFromFourNumber;

public class MaxFromFourNumberTest {
  public void test_getMinMax_withNormalValues() {
    int[] numbers = { 3, 5, 7, 2 };
    String expected = "min: 2\nmax: 7";
    String actual = MaxFromFourNumber.getMinMax(numbers);
    assertEquals(expected, actual);
  }

  @Test
  public void test_getMinMax_withNegativeValues() {
    int[] numbers = { -10, -5, 0, 5 };
    String expected = "min: -10\nmax: 5";
    String actual = MaxFromFourNumber.getMinMax(numbers);
    assertEquals(expected, actual);
  }

  @Test
  public void test_getMinMax_withAllEqualValues() {
    int[] numbers = { 4, 4, 4, 4 };
    String expected = "min: 4\nmax: 4";
    String actual = MaxFromFourNumber.getMinMax(numbers);
    assertEquals(expected, actual);
  }

  @Test
  public void test_getMinMax_withSingleValue() {
    int[] numbers = { 42 };
    String expected = "min: 42\nmax: 42";
    String actual = MaxFromFourNumber.getMinMax(numbers);
    assertEquals(expected, actual);
  }
}
