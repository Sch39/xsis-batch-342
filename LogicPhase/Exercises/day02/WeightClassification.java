package logicphase.exercises.day02;

public class WeightClassification {
  /**
   * 
   * @param h (m)
   * @param w (kg)
   * @return String
   */
  public static String getWeightCategory(float h, float w) {
    float bmi = w / (h * h);
    String category = "Undefined";
    if (bmi < 18.5) {
      category = "Kurus";
    } else if (bmi <= 24.9) {
      category = "Normal";
    } else if (bmi <= 25) {
      category = "Gemuk";
    } else if (bmi >= 30) {
      category = "Obesitas";
    }

    return category;
  }
}
