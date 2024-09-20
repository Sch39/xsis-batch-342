package logicphase.exercises.day04;

public class MatrixIndexPattern {
  public static String getPattern(int n) {
    String pattern = "";
    for (int i = 0; i < n; i++) {
      for (int j = 0; j < n; j++) {
        pattern += String.valueOf(i) + String.valueOf(j);
        if (j < n - 1) {
          pattern += " ";
        }
      }

      if (i < n - 1) {
        pattern += "\n";
      }
    }
    return pattern;
  }
}
