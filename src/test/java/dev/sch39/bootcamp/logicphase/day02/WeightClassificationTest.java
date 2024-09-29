package dev.sch39.bootcamp.logicphase.day02;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

@Tag("day02")
public class WeightClassificationTest {
  @Test
  public void testKurusCategory() {
    String result = WeightClassification.getWeightCategory(1.75f, 50f);
    assertEquals("Kurus", result);
  }

  @Test
  public void testNormalCategory() {
    String result = WeightClassification.getWeightCategory(1.75f, 70f);
    assertEquals("Normal", result);
  }

  @Test
  public void testGemukCategory() {
    String result = WeightClassification.getWeightCategory(1.75f, 77f);
    assertEquals("Gemuk", result);
  }

  @Test
  public void testObesitasCategory() {
    String result = WeightClassification.getWeightCategory(1.75f, 95f);
    assertEquals("Obesitas", result);
  }

  @Test
  public void testUndefinedCategory() {
    String result = WeightClassification.getWeightCategory(0f, 0f);
    assertEquals("Undefined", result);
  }
}
