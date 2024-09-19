package logicphase.exercises.day03;

public class DayParagraph {
  public static String[] getPara(String dayName) {
    String[] days = {
        "senin",
        "selasa",
        "rabu",
        "kamis",
        "jum'at",
        "sabtu",
        "minggu",
    };

    Integer[] numberOperations = {
        -2,
        -1,
        0,
        1,
        2,
    };

    String[] paragraphs = {
        "kemarin lusa adalah hari ",
        "kemarin adalah hari ",
        "hari ini adalah ",
        "besok adalah hari ",
        "besok lusa adalah hari ",
    };

    Boolean isValidDayName = false;

    for (int i = 0; i < days.length; i++) {
      if (days[i] == dayName) {
        isValidDayName = true;
        break;
      }
    }

    if (!isValidDayName) {
      return null;
    }
    Integer currentDay = DayNumber.getNumber(dayName) - 1;

    for (int i = 0; i < numberOperations.length; i++) {
      int index = currentDay + numberOperations[i];

      int daysLen = days.length;
      if (index < 0) {
        index = daysLen + index;
      }
      if (index > daysLen) {
        index = index + daysLen;
      }

      paragraphs[i] = paragraphs[i] + DayName.getName(index + 1);
    }

    return paragraphs;
  }

  public static void main(String[] args) {
    getPara("senin");
  }
}
