package dev.sch39.bootcamp.logicphase.day03;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import java.time.Year;
import java.util.*;

@Tag("day03")
public class LeapYearTest {
  @Test
  public void testGetYear_ValidStartYear() {
    int startYear = 2000;
    ArrayList<Integer> expected = new ArrayList<>(Arrays.asList(2000, 2004, 2008, 2012, 2016, 2020, 2024));
    assertEquals(expected, LeapYear.getYear(startYear));
  }

  @Test
  public void testGetYear_StartYearGreaterThanCurrentYear() {
    int startYear = Year.now().getValue() + 1;
    ArrayList<Integer> expected = new ArrayList<>();
    assertEquals(expected, LeapYear.getYear(startYear));
  }

  @Test
  public void testGetYear_NegativeStartYear() {
    int startYear = -5;
    ArrayList<Integer> expected = new ArrayList<>();
    assertEquals(expected, LeapYear.getYear(startYear));
  }

}
