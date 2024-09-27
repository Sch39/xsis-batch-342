package logicphase.exercises.day10.packagedelivery;

import java.util.Map;

public interface Order {
  public Map<String, Integer> estimate2Destination();

  public void orderedInMonth(Integer day);

  public void orderedInWeek(Integer day);

  public void setNationalHoliday(Integer... holiday);
}
