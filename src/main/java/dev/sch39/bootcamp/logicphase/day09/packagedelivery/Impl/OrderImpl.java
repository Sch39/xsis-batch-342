package dev.sch39.bootcamp.logicphase.day09.packagedelivery.Impl;

import java.util.Arrays;
import java.util.HashMap;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Map;

import dev.sch39.bootcamp.logicphase.day09.packagedelivery.Order;

public class OrderImpl implements Order {
  private List<Integer> nationalHoliday;
  private Integer orderedDayInMonth, orderedDayInWeek;

  @Override
  public Map<String, Integer> estimate2Destination() {
    int workDayCounter = 1;
    int diffDay = 0;
    int diffMonth = 0;
    int orderedDayInMonthTmp = this.orderedDayInMonth;

    while (workDayCounter <= 7) {
      if (this.orderedDayInWeek < 7) {
        this.orderedDayInWeek++;
      } else {
        this.orderedDayInWeek = 1;
      }

      if (orderedDayInMonthTmp < 31) {
        orderedDayInMonthTmp++;
      } else {
        diffMonth++;
        orderedDayInMonthTmp = 1;
      }

      diffDay++;

      if (nationalHoliday.contains(orderedDayInMonthTmp)) {
        continue;
      } else if (this.orderedDayInWeek.equals(6)
          || this.orderedDayInWeek.equals(7)) {
        continue;
      }
      workDayCounter++;
    }

    Map<String, Integer> result = new HashMap<>();
    result.put("dayInWeek", this.orderedDayInWeek);
    result.put("dayInMonth",
        (diffDay + this.orderedDayInMonth <= 31) ? diffDay + this.orderedDayInMonth
            : diffDay + this.orderedDayInMonth - 31);
    result.put("monthInYear", diffMonth);

    return result;
  }

  public String getNameDayInWeek(int dayInWeek) {
    switch (dayInWeek) {
      case 1:
        return "Senin";
      case 2:
        return "Selasa";
      case 3:
        return "Rabu";
      case 4:
        return "Kamis";
      case 5:
        return "Jum'at";
      case 6:
        return "Sabtu";
      case 7:
        return "Minggu";
    }
    return null;
  }

  @Override
  public void setNationalHoliday(Integer... holiday) {
    this.nationalHoliday = Arrays.asList(holiday);
  }

  @Override
  public void orderedInMonth(Integer day) {
    if (day > 31 || day <= 0) {
      throw new InputMismatchException("Input range 1-31");
    }
    this.orderedDayInMonth = day;
  }

  @Override
  public void orderedInWeek(Integer day) {
    if (day > 7 || day <= 0) {
      throw new InputMismatchException("Range 1-7");
    }
    this.orderedDayInWeek = day;
  }
}
