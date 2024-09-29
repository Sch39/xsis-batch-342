package dev.sch39.bootcamp.logicphase.day02;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

@Tag("day02")
public class MaxFromFourNumberTest {
  @Test
  public void testGetMinMaxWithPositiveNumbers() {
    int[] numbers = { 4, 2, 8, 5 };
    String expected = "min: 2\nmax: 8";
    String result = MaxFromFourNumber.getMinMax(numbers);
    assertEquals(expected, result);
  }

  @Test
  public void testGetMinMaxWithNegativeNumbers() {
    int[] numbers = { -10, -20, -5, -30 };
    String expected = "min: -30\nmax: -5";
    String result = MaxFromFourNumber.getMinMax(numbers);
    assertEquals(expected, result);
  }

  @Test
  public void testGetMinMaxWithMixedNumbers() {
    int[] numbers = { 10, -5, 20, -15 };
    String expected = "min: -15\nmax: 20";
    String result = MaxFromFourNumber.getMinMax(numbers);
    assertEquals(expected, result);
  }

  @Test
  public void testGetMinMaxWithSingleElement() {
    int[] numbers = { 42 };
    String expected = "min: 42\nmax: 42";
    String result = MaxFromFourNumber.getMinMax(numbers);
    assertEquals(expected, result);
  }

  @Test
  public void testGetMinMaxWithSameNumbers() {
    int[] numbers = { 5, 5, 5, 5 };
    String expected = "min: 5\nmax: 5";
    String result = MaxFromFourNumber.getMinMax(numbers);
    assertEquals(expected, result);
  }
}
