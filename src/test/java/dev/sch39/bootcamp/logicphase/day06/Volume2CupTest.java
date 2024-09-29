package dev.sch39.bootcamp.logicphase.day06;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

@Tag("day06")
public class Volume2CupTest {
  @Test
  void testGetCupWithGlass() {
    Double expected = 25.0; // 10 * 2.5
    Double result = Volume2Cup.getCup(10, "glass");
    assertEquals(expected, result);
  }

  @Test
  void testGetCupWithBottle() {
    Double expected = 50.0; // 10 * (2.5 * 2)
    Double result = Volume2Cup.getCup(10, "bottle");
    assertEquals(expected, result);
  }

  @Test
  void testGetCupWithTeapot() {
    Double expected = 250.0; // 10 * 25.0
    Double result = Volume2Cup.getCup(10, "teapot");
    assertEquals(expected, result);
  }

  @Test
  void testGetCupWithInvalidContainer() {
    Double result = Volume2Cup.getCup(10, "invalid");
    assertNull(result);
  }

  @Test
  void testGetCupWithZeroVolume() {
    Double expected = 0.0;
    Double result = Volume2Cup.getCup(0, "glass");
    assertEquals(expected, result);
  }
}
