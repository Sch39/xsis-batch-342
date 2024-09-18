package logicphase.exercises.day01.__tests__;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import logicphase.exercises.day01.Diff21;

public class Diff21Test {
  @Test
  public void it_should_return_diff_when_less_than_21() {
    assertEquals(2, Diff21.diff21(19));
    assertEquals(1, Diff21.diff21(20));
    assertEquals(0, Diff21.diff21(21));
  }

  @Test
  public void it_should_return_result_of_diff_multiply_by_2_when_greater_than_21() {
    assertEquals(2, Diff21.diff21(22));
    assertEquals(4, Diff21.diff21(23));
    assertEquals(6, Diff21.diff21(24));
  }
}
