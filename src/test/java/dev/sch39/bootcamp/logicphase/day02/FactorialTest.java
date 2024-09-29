package dev.sch39.bootcamp.logicphase.day02;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

@Tag("day02")
public class FactorialTest {
  @Test
  public void testFactorialOfZero() {
    assertEquals(1, Factorial.getFactorial(0));
  }

  @Test
  public void testFactorialOfOne() {
    assertEquals(1, Factorial.getFactorial(1));
  }

  @Test
  public void testFactorialOfPositiveNumber() {
    assertEquals(120, Factorial.getFactorial(5));
    assertEquals(720, Factorial.getFactorial(6));
    assertEquals(3628800, Factorial.getFactorial(10));
  }

  @Test
  public void testFactorialOfNegativeNumber() {
    assertThrows(IllegalArgumentException.class, () -> {
      Factorial.getFactorial(-1);
    });
  }
}
