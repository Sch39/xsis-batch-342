package dev.sch39.bootcamp.logicphase.day05;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

@Tag("day05")
public class StatisticDecsriptiveTest {
  @Test
  public void testGetMean() {
    Integer[] arr = { 1, 2, 3, 4, 5 };
    Double expectedMean = 3.0;
    assertEquals(expectedMean, StatisticDecsriptive.getMean(arr));
  }

  @Test
  public void testGetMedianOddLength() {
    Integer[] arr = { 1, 3, 5, 7, 9 };
    Double expectedMedian = 5.0;
    assertEquals(expectedMedian, StatisticDecsriptive.getMedian(arr));
  }

  @Test
  public void testGetMedianEvenLength() {
    Integer[] arr = { 1, 2, 3, 4, 5, 6 };
    Double expectedMedian = 3.5;
    assertEquals(expectedMedian, StatisticDecsriptive.getMedian(arr));
  }

  @Test
  public void testGetMode() {
    Integer[] arr = { 1, 2, 2, 3, 4 };
    Integer expectedMode = 2;
    assertEquals(expectedMode, StatisticDecsriptive.getMode(arr));
  }

  @Test
  public void testGetModeNoMode() {
    Integer[] arr = { 1, 2, 3, 4, 5 }; // no mode in this array
    assertNull(StatisticDecsriptive.getMode(arr));
  }

  @Test
  public void testGetMin() {
    Integer[] arr = { 3, 1, 4, 1, 5, 9 };
    Integer expectedMin = 1;
    assertEquals(expectedMin, StatisticDecsriptive.getMin(arr));
  }

  @Test
  public void testGetMax() {
    Integer[] arr = { 3, 1, 4, 1, 5, 9 };
    Integer expectedMax = 9;
    assertEquals(expectedMax, StatisticDecsriptive.getMax(arr));
  }
}
