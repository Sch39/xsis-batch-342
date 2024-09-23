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

  public static Integer[][] getOddEvenPattern(int size) {
    Integer[][] pattern = new Integer[size][size];
    int initOdd = 1,
        initEven = 2;
    for (int i = 0; i < size; i++) {
      for (int j = 0; j < size; j++) {
        if (i % 2 == 0) {
          pattern[i][j] = initOdd;
          initOdd += 2;
        } else {
          pattern[i][j] = initEven;
          initEven += 2;
        }
      }
    }

    return pattern;
  }
}
