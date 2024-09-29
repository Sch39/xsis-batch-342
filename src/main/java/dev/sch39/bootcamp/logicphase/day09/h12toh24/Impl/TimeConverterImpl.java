package dev.sch39.bootcamp.logicphase.day09.h12toh24.Impl;

import java.util.HashMap;
import java.util.Map;

import dev.sch39.bootcamp.logicphase.day09.h12toh24.Time;

public class TimeConverterImpl implements Time {
  private Map<String, Object> strConverter(String str) {
    str = str.replaceAll(" ", "");
    Map<String, Object> result = new HashMap<>();
    if (str.length() < 5 || str.length() > 7) {
      throw new IllegalArgumentException("Invalid time format");
    }

    result.put("hours", Integer.parseInt(str.substring(0, 2)));
    result.put("minutes", Integer.parseInt(str.substring(3, 5)));

    if (str.length() == 7) {
      result.put("type", str.substring(5, 7).toLowerCase());
    } else {
      result.put("type", null);
    }

    return result;
  }

  private String formatTime(Integer hours, Integer minutes) {
    String hoursStr = (hours < 10 ? "0" + hours : hours.toString());
    String minutesStr = (minutes < 10 ? "0" + minutes : minutes.toString());
    return hoursStr + ":" + minutesStr;
  }

  private String amTo24H(Integer hours, Integer minutes) {
    if (hours == 12)
      hours = 0;
    return this.formatTime(hours, minutes);
  }

  private String pmTo24H(Integer hours, Integer minutes) {
    if (hours != 12)
      hours += 12;
    return this.formatTime(hours, minutes);
  }

  private String h24ToPm(Integer hours, Integer minutes) {
    if (hours == 12) {
      return formatTime(hours, minutes) + " PM";
    }
    return formatTime(hours - 12, minutes) + " PM";
  }

  private String h24ToAm(Integer hours, Integer minutes) {
    if (hours == 0) {
      return formatTime(12, minutes) + " AM";
    }
    return formatTime(hours, minutes) + " AM";
  }

  @Override
  public String convertTime(String str) {
    Map<String, Object> formattedStr = this.strConverter(str);
    int hours = (int) formattedStr.get("hours");
    int minutes = (int) formattedStr.get("minutes");
    String type = (String) formattedStr.get("type");

    if (type != null) {
      return type.equals("am") ? this.amTo24H(hours, minutes) : this.pmTo24H(hours, minutes);
    }

    return hours >= 12 ? this.h24ToPm(hours, minutes) : this.h24ToAm(hours, minutes);
  }
}
