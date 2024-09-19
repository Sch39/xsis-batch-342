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

    String[] expected7 = {
        "kemarin lusa adalah hari minggu",
        "kemarin adalah hari senin",
        "hari ini adalah selasa",
        "besok adalah hari rabu",
        "besok lusa adalah hari kamis",
    };

    assertArrayEquals(expected7, DayParagraph.getPara("selasa"));

    String[] expected2 = {
        "kemarin lusa adalah hari senin",
        "kemarin adalah hari selasa",
        "hari ini adalah rabu",
        "besok adalah hari kamis",
        "besok lusa adalah hari jum'at",
    };
    assertArrayEquals(expected2, DayParagraph.getPara("rabu"));

    String[] expected3 = {
        "kemarin lusa adalah hari selasa",
        "kemarin adalah hari rabu",
        "hari ini adalah kamis",
        "besok adalah hari jum'at",
        "besok lusa adalah hari sabtu",
    };
    assertArrayEquals(expected3, DayParagraph.getPara("kamis"));

    String[] expected4 = {
        "kemarin lusa adalah hari rabu",
        "kemarin adalah hari kamis",
        "hari ini adalah jum'at",
        "besok adalah hari sabtu",
        "besok lusa adalah hari minggu",
    };
    assertArrayEquals(expected4, DayParagraph.getPara("jum'at"));

    String[] expected5 = {
        "kemarin lusa adalah hari kamis",
        "kemarin adalah hari jum'at",
        "hari ini adalah sabtu",
        "besok adalah hari minggu",
        "besok lusa adalah hari senin",
    };
    assertArrayEquals(expected5, DayParagraph.getPara("sabtu"));

    String[] expected6 = {
        "kemarin lusa adalah hari jum'at",
        "kemarin adalah hari sabtu",
        "hari ini adalah minggu",
        "besok adalah hari senin",
        "besok lusa adalah hari selasa",
    };
    assertArrayEquals(expected6, DayParagraph.getPara("minggu"));
  }

  @Test
  public void it_should_return_null_when_input_is_not_valid() {
    assertSame(null, DayParagraph.getPara("abcd"));
    assertSame(null, DayParagraph.getPara("qwerty"));
  }
}
