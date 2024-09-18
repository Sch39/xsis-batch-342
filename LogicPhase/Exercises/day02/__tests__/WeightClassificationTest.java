package logicphase.exercises.day02.__tests__;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import logicphase.exercises.day02.WeightClassification;

public class WeightClassificationTest {
  @Test
  public void it_should_classified_when_width_and_height_given() {
    assertEquals("Kurus", WeightClassification.getWeightCategory(1.6f, 43.4f));
    assertEquals("Normal", WeightClassification.getWeightCategory(1.6f, 47.4f));
    assertEquals("Gemuk", WeightClassification.getWeightCategory(1.6f, 64.0f));
    assertEquals("Obesitas", WeightClassification.getWeightCategory(1.6f, 76.8f));
  }
}
