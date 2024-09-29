package dev.sch39.bootcamp.logicphase.day02;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

@Tag("day02")
public class InRange30And50Test {
  @Test
  public void testBothNumbersInRange() {
    assertTrue(InRange30And50.isInRange(35, 45));
  }

  @Test
  public void testFirstNumberOutOfRange() {
    assertFalse(InRange30And50.isInRange(25, 45));
  }

  @Test
  public void testSecondNumberOutOfRange() {
    assertFalse(InRange30And50.isInRange(35, 55));
  }

  @Test
  public void testBothNumbersOutOfRange() {
    assertFalse(InRange30And50.isInRange(25, 55));
  }

  @Test
  public void testBoundaryValuesInRange() {
    assertTrue(InRange30And50.isInRange(30, 50));
  }

  @Test
  public void testBoundaryValuesOutOfRange() {
    assertFalse(InRange30And50.isInRange(29.99f, 50.01f));
  }
}
