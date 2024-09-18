package logicphase.exercises.day02;

public class MaxFromFourNumber {
  /**
   * Get min and max value from array
   * 
   * @param {int} num
   * @return {String}
   */
  public static String getMinMax(int[] num) {
    int min = num[0];
    int max = num[0];

    for (int i = 1; i < num.length; i++) { // Mulai dari indeks 1 karena indeks 0 sudah digunakan
      if (num[i] < min) {
        min = num[i];
      }

      if (num[i] > max) {
        max = num[i];
      }
    }

    return "min: " + min + "\nmax: " + max;
  }
}
