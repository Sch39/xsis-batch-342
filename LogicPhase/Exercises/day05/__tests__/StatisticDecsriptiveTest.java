package logicphase.exercises.day05.__tests__;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import logicphase.exercises.day05.StatisticDecsriptive;

public class StatisticDecsriptiveTest {
  Integer[] input1 = { 1, 2, 3, 4, 1 }; // 1,1,2,3,4 -> mean: 2.2; median: 2; modus: 1; min: 1; max: 4
  Integer[] input2 = { 5, 23, 30, 1 }; // 1,5,23,30 -> mean: 14.75; median: 14; modus: null; min: 1; max: 30
  Integer[] input3 = { 1, 4, 8, 2, 3, 4, 7, 10 }; // 1,2,3,4,4,7,8,10 -> mean: 4.875; median: 3.5; modus: 4; min: 1;max:
                                                  // 10

  @Test
  public void it_should_return_mean() {
    assertEquals((Double) 2.2, StatisticDecsriptive.getMean(input1));
    assertEquals((Double) 14.75, StatisticDecsriptive.getMean(input2));
    assertEquals((Double) 4.875, StatisticDecsriptive.getMean(input3));
  }

  @Test
  public void it_should_return_median() {
    assertEquals((Double) 2.0, StatisticDecsriptive.getMedian(input1));
    assertEquals((Double) 14.0, StatisticDecsriptive.getMedian(input2));
    assertEquals((Double) 4.0, StatisticDecsriptive.getMedian(input3));
  }

  @Test
  public void it_should_return_mode() {
    assertEquals((Integer) 1, StatisticDecsriptive.getMode(input1));
    assertEquals((Integer) null, StatisticDecsriptive.getMode(input2));
    assertEquals((Integer) 4, StatisticDecsriptive.getMode(input3));
  }

  @Test
  public void it_should_return_min() {
    assertEquals((Integer) 1, StatisticDecsriptive.getMin(input1));
    assertEquals((Integer) 1, StatisticDecsriptive.getMin(input2));
    assertEquals((Integer) 1, StatisticDecsriptive.getMin(input3));
  }

  @Test
  public void it_should_return_max() {
    assertEquals((Integer) 4, StatisticDecsriptive.getMax(input1));
    assertEquals((Integer) 30, StatisticDecsriptive.getMax(input2));
    assertEquals((Integer) 10, StatisticDecsriptive.getMax(input3));
  }
}
