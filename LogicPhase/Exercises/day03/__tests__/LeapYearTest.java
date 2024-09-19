package logicphase.exercises.day03.__tests__;

import static org.junit.Assert.assertArrayEquals;

import java.util.ArrayList;
import java.util.Arrays;

import org.junit.Test;

import logicphase.exercises.day03.LeapYear;

public class LeapYearTest {
  @Test
  public void it_should_return_correct_leap_year_when_input_year_less_then_now() {
    ArrayList<Integer> expected1 = new ArrayList<>(
        Arrays.asList(2000,
            2004,
            2008,
            2012,
            2016,
            2020,
            2024));

    assertArrayEquals(expected1.toArray(), LeapYear.getYear(2000).toArray());
  }

  @Test
  public void it_should_return_null_when_input_year_less_then_now() {
    ArrayList<Integer> emptyArr = new ArrayList<>();
    assertArrayEquals(emptyArr.toArray(), LeapYear.getYear(2025).toArray());
    assertArrayEquals(emptyArr.toArray(), LeapYear.getYear(2026).toArray());
    assertArrayEquals(emptyArr.toArray(), LeapYear.getYear(2027).toArray());
  }
}
