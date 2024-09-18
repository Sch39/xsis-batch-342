package logicphase.exercises.day01.__tests__;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import logicphase.exercises.day01.Diff21;

public class Diff21Test {
  @Test
  public void it_should_return_diff_when_less_than_21() {
    assertEquals(19, Diff21.diff21(2));
    assertEquals(20, Diff21.diff21(1));
    assertEquals(21, Diff21.diff21(0));
  }

  // @Test
  // public
}
