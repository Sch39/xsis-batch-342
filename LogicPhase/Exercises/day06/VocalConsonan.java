package logicphase.exercises.day06;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class VocalConsonan {
  public static Map<String, String> getVocalConsonanSorted(String str) {
    Map<String, String> result = new HashMap<String, String>() {
      {
        put("vocal", "");
        put("consonan", "");
      }
    };

    char[] charArr = str.trim().replaceAll(" ", "").toLowerCase().toCharArray();
    Arrays.sort(charArr);

    for (int i = 0; i < charArr.length; i++) {
      if (isVocalChar(charArr[i])) {
        result.put("vocal", result.get("vocal") + charArr[i]);
      } else {
        result.put("consonan", result.get("consonan") + charArr[i]);
      }
    }

    return result;
  }

  private static Boolean isVocalChar(char c) {
    switch (c) {
      case 'a':
        return true;
      case 'i':
        return true;
      case 'u':
        return true;
      case 'e':
        return true;
      case 'o':
        return true;
      default:
        return false;
    }
  }

  public static void main(String[] args) {
    Map<String, String> expexted1 = getVocalConsonanSorted("Sample Case");
    System.out.println(expexted1);
    Map<String, String> expexted2 = getVocalConsonanSorted("Next Case");
    System.out.println(expexted2);
  }
}
