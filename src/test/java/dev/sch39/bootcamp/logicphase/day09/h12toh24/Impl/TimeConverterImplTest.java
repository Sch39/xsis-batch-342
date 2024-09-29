package dev.sch39.bootcamp.logicphase.day09.h12toh24.Impl;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Tags;
import org.junit.jupiter.api.Test;

@Tags({
    @Tag("day09"),
    @Tag("12h-to-24h")
})
public class TimeConverterImplTest {
  private final TimeConverterImpl timeConverter = new TimeConverterImpl();

  @Test
  void testConvertTimeAm() {
    assertEquals("06:30", timeConverter.convertTime("06:30 AM"));
    assertEquals("00:00", timeConverter.convertTime("12:00 AM"));
    assertEquals("11:59", timeConverter.convertTime("11:59 AM"));
  }

  @Test
  void testConvertTimePm() {
    assertEquals("12:00", timeConverter.convertTime("12:00 PM"));
    assertEquals("13:00", timeConverter.convertTime("01:00 PM"));
    assertEquals("23:59", timeConverter.convertTime("11:59 PM"));
  }

  @Test
  void testConvertTime24ToPm() {
    assertEquals("12:00 PM", timeConverter.convertTime("12:00"));
    assertEquals("01:00 PM", timeConverter.convertTime("13:00"));
    assertEquals("11:59 PM", timeConverter.convertTime("23:59"));
  }

  @Test
  void testConvertTime24ToAm() {
    assertEquals("12:00 AM", timeConverter.convertTime("00:00"));
    assertEquals("11:59 AM", timeConverter.convertTime("11:59"));
    assertEquals("06:30 AM", timeConverter.convertTime("06:30"));
  }
}
