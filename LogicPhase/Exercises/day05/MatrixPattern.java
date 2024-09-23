package logicphase.exercises.day05;

public class MatrixPattern {
  public static Integer[][] getBig2SmallPattern(int size) {
    Integer[][] pattern = new Integer[size][size];
    int lastNumber = size * size;

    for (int i = 0; i < size; i++) {
      for (int j = 0; j < size; j++) {
        pattern[i][j] = lastNumber;
        lastNumber--;
      }
    }

    return pattern;
  }
}
