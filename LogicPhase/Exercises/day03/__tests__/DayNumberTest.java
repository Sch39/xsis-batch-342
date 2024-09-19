package logicphase.exercises.day03.__tests__;

import static org.junit.Assert.assertSame;

import org.junit.Test;

import logicphase.exercises.day03.DayNumber;

public class DayNumberTest {
  @Test
  public void it_should_return_number_of_day_when_input_valid_name() {
    assertSame(1, DayNumber.getNumber("senin"));
    assertSame(2, DayNumber.getNumber("selasa"));
    assertSame(3, DayNumber.getNumber("rabu"));
    assertSame(4, DayNumber.getNumber("kamis"));
    assertSame(5, DayNumber.getNumber("jum'at"));
    assertSame(6, DayNumber.getNumber("sabtu"));
    assertSame(7, DayNumber.getNumber("minggu"));
  }

  @Test
  public void it_should_not_return_day_number_if_input_not_valid() {
    assertSame(null, DayNumber.getNumber("abcd"));
    assertSame(null, DayNumber.getNumber("qwerty"));
    assertSame(null, DayNumber.getNumber("hehehe"));
  }
}
