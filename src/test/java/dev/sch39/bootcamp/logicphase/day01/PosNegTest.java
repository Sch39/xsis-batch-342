package dev.sch39.bootcamp.logicphase.day01;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

@Tag("day01")
public class PosNegTest {
  @Test
  void testBothNegativeAndFlagTrue() {
    assertTrue(PosNeg.posNeg(-4, -5, true), "Both numbers are negative and flag is true");
  }

  @Test
  void testOneNegativeOnePositiveAndFlagFalse() {
    assertTrue(PosNeg.posNeg(-4, 5, false), "One number is negative, one is positive, and flag is false");
  }

  @Test
  void testBothPositiveAndFlagTrue() {
    assertFalse(PosNeg.posNeg(4, 5, true), "Both numbers are positive and flag is true");
  }

  @Test
  void testBothPositiveAndFlagFalse() {
    assertFalse(PosNeg.posNeg(4, 5, false), "Both numbers are positive and flag is false");
  }

  @Test
  void testBothNegativeAndFlagFalse() {
    assertFalse(PosNeg.posNeg(-4, -5, false), "Both numbers are negative and flag is false");
  }

  @Test
  void testOneNegativeOnePositiveAndFlagTrue() {
    assertFalse(PosNeg.posNeg(-4, 5, true), "One number is negative, one is positive, and flag is true");
  }

  @Test
  void testOnePositiveOneNegativeAndFlagFalse() {
    assertTrue(PosNeg.posNeg(4, -5, false), "One number is positive, one is negative, and flag is false");
  }
}
