package dev.sch39.bootcamp.logicphase.day01;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

@Tag("day01")
public class SumDoubleTest {
  @Test
  public void testSumDifferentValues() {
    assertEquals(5, SumDouble.sumDouble(2, 3));
  }

  @Test
  public void testSumSameValues() {
    assertEquals(16, SumDouble.sumDouble(4, 4));
  }

  @Test
  public void testSumZero() {
    assertEquals(0, SumDouble.sumDouble(0, 0));
  }
}
