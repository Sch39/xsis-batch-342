package dev.sch39.bootcamp.logicphase.day03;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

@Tag("day03")
public class DayNameTest {
  @Test
  void testGetName() {
    // Test untuk setiap hari dalam rentang 1-7
    assertEquals("senin", DayName.getName(1));
    assertEquals("selasa", DayName.getName(2));
    assertEquals("rabu", DayName.getName(3));
    assertEquals("kamis", DayName.getName(4));
    assertEquals("jum'at", DayName.getName(5));
    assertEquals("sabtu", DayName.getName(6));
    assertEquals("minggu", DayName.getName(7));

    // Test untuk nilai di luar rentang (out of range)
    assertEquals("Out of range!", DayName.getName(0));
    assertEquals("Out of range!", DayName.getName(8));
    assertEquals("Out of range!", DayName.getName(-1));
  }
}
