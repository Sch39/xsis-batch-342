package logicphase.exercises.day03.__tests__;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import logicphase.exercises.day03.DayName;

public class DayNameTest {
  @Test
  public void it_should_return_name_of_day_when_input_valid_number() {
    assertEquals("senin", DayName.getName(1));
    assertEquals("selasa", DayName.getName(2));
    assertEquals("rabu", DayName.getName(3));
    assertEquals("kamis", DayName.getName(4));
    assertEquals("jum'at", DayName.getName(5));
    assertEquals("sabtu", DayName.getName(6));
    assertEquals("minggu", DayName.getName(7));
  }

  @Test
  public void it_should_not_return_day_name_if_input_out_of_range() {
    assertEquals("Out of range!", DayName.getName(8));
    assertEquals("Out of range!", DayName.getName(9));
    assertEquals("Out of range!", DayName.getName(-1));
  }
}
