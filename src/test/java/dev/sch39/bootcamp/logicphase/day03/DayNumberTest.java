package dev.sch39.bootcamp.logicphase.day03;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

@Tag("day03")
public class DayNumberTest {
  @Test
  void testValidDays() {
    assertEquals(1, DayNumber.getNumber("senin"));
    assertEquals(2, DayNumber.getNumber("selasa"));
    assertEquals(3, DayNumber.getNumber("rabu"));
    assertEquals(4, DayNumber.getNumber("kamis"));
    assertEquals(5, DayNumber.getNumber("jum'at"));
    assertEquals(6, DayNumber.getNumber("sabtu"));
    assertEquals(7, DayNumber.getNumber("minggu"));
  }

  @Test
  void testInvalidDay() {
    assertNull(DayNumber.getNumber("invalid-day"));
  }

  @Test
  void testEmptyInput() {
    assertNull(DayNumber.getNumber(""));
  }

  @Test
  void testNullInput() {
    assertNull(DayNumber.getNumber(null));
  }
}
