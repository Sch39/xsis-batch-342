package dev.sch39.bootcamp.logicphase.day03;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

@Tag("day03")
public class DayParagraphTest {
  @Test
  void testGetPara_validDay() {
    // Test case untuk hari valid
    String[] expected = {
        "kemarin lusa adalah hari sabtu",
        "kemarin adalah hari minggu",
        "hari ini adalah senin",
        "besok adalah hari selasa",
        "besok lusa adalah hari rabu"
    };

    String[] result = DayParagraph.getPara("senin");
    assertArrayEquals(expected, result);
  }

  @Test
  void testGetPara_invalidDay() {
    // Test case untuk hari tidak valid
    String[] result = DayParagraph.getPara("invalid-day");
    assertNull(result);
  }

  @Test
  void testGetPara_lastDayOfWeek() {
    // Test case untuk hari terakhir (minggu)
    String[] expected = {
        "kemarin lusa adalah hari jum'at",
        "kemarin adalah hari sabtu",
        "hari ini adalah minggu",
        "besok adalah hari senin",
        "besok lusa adalah hari selasa"
    };

    String[] result = DayParagraph.getPara("minggu");
    assertArrayEquals(expected, result);
  }
}
