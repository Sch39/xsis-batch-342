package logicphase.exercises.day10.ampmconverter.Impl;

import java.util.HashMap;
import java.util.Map;

import logicphase.exercises.day10.ampmconverter.Time;

public class TimeConverterImpl implements Time {
  private Map<String, Object> strConverter(String str) {
    str = str.replaceAll(" ", "");
    Map<String, Object> result = new HashMap<>();
    result.put("hours", Integer.parseInt(str.substring(0, 2)));
    result.put("minutes", Integer.parseInt(str.substring(3, 5)));

    if (str.length() == 7) {
      result.put("type", str.substring(5, 7).toLowerCase());
    } else {
      result.put("type", null);
    }

    return result;
  }

  private String amTo24H(Integer hours, Integer minutes) {
    String hoursStr = hours == 12 ? "00" : hours < 10 ? "0" + hours : hours + "";
    String minutesStr = minutes < 10 ? "0" + minutes : minutes + "";
    return hoursStr + ":" + minutesStr;
  }

  private String pmTo24H(Integer hours, Integer minutes) {
    String hoursStr = hours == 12 ? hours + "" : hours + 12 + "";
    String minutesStr = minutes < 10 ? "0" + minutes : minutes + "";
    return hoursStr + ":" + minutesStr;
  }

  private String h24ToPm(Integer hours, Integer minutes) {
    String hoursStr = (hours - 12) < 10 ? "0" + (hours - 12) : (hours - 12) + "";
    String minutesStr = minutes < 10 ? "0" + minutes : minutes + "";
    return hoursStr + ":" + minutesStr + " PM";
  }

  private String h24ToAm(Integer hours, Integer minutes) {
    String hoursStr = hours < 10 ? "0" + hours : hours + "";
    String minutesStr = minutes < 10 ? "0" + minutes : minutes + "";
    return hoursStr + ":" + minutesStr + " AM";
  }

  @Override
  public String convertTime(String str) {
    Map<String, Object> formattedStr = this.strConverter(str);
    int hours = (int) formattedStr.get("hours");
    int minutes = (int) formattedStr.get("minutes");
    String type = (String) formattedStr.get("type");

    if (type != null) {
      if (type.equals("am")) {
        return this.amTo24H(hours, minutes);
      } else if (type.equals("pm")) {
        return this.pmTo24H(hours, minutes);
      }
    }

    if (hours >= 12) {
      return this.h24ToPm(hours, minutes);
    }

    return this.h24ToAm(hours, minutes);
  }
}
