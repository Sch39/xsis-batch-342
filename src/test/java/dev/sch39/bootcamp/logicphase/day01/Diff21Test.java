package dev.sch39.bootcamp.logicphase.day01;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

@Tag("day01")
public class Diff21Test {
  @Test
  public void testDiffWenLessThan21() {
    assertEquals(2, Diff21.diff21(19));
    assertEquals(1, Diff21.diff21(20));
    assertEquals(0, Diff21.diff21(21));
  }

  @Test
  public void testDiffWhenGreatherThan21() {
    assertEquals(2, Diff21.diff21(22));
    assertEquals(4, Diff21.diff21(23));
    assertEquals(6, Diff21.diff21(24));
  }
}
