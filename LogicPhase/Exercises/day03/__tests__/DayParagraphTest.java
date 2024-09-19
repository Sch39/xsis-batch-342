package logicphase.exercises.day03.__tests__;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertSame;

import org.junit.Test;

import logicphase.exercises.day03.DayParagraph;

public class DayParagraphTest {
  @Test
  public void it_should_return_array_paragraph_if_input_name_valid() {
    String[] expected1 = {
        "kemarin lusa adalah hari sabtu",
        "kemarin adalah hari minggu",
        "hari ini adalah senin",
        "besok adalah hari selasa",
        "besok lusa adalah hari rabu",
    };

    assertArrayEquals(expected1, DayParagraph.getPara("senin"));

    String[] expected2 = {
        "kemarin lusa adalah hari senin",
        "kemarin adalah hari selasa",
        "hari ini adalah rabu",
        "besok adalah hari kamis",
        "besok lusa adalah hari jum'at",
    };
    assertArrayEquals(expected2, DayParagraph.getPara("rabu"));
  }

  @Test
  public void it_should_return_null_when_input_is_not_valid() {
    assertSame(null, DayParagraph.getPara("abcd"));
    assertSame(null, DayParagraph.getPara("qwerty"));
  }
}
