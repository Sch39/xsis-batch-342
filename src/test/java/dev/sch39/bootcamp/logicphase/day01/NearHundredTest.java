package dev.sch39.bootcamp.logicphase.day01;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

@Tag("day01")
public class NearHundredTest {
  @Test
  public void testDifferenceTo100LessThan10() {
    assertTrue(NearHundred.nearHundred(90));
    assertTrue(NearHundred.nearHundred(91));
    assertTrue(NearHundred.nearHundred(109));
    assertTrue(NearHundred.nearHundred(110));
  }

  @Test
  public void testDifferenceTo100GreatherThan10() {
    assertFalse(NearHundred.nearHundred(89));
    assertFalse(NearHundred.nearHundred(88));
    assertFalse(NearHundred.nearHundred(111));
    assertFalse(NearHundred.nearHundred(112));
  }

  @Test
  public void testDifferenceTo200LessThan10() {
    assertTrue(NearHundred.nearHundred(190));
    assertTrue(NearHundred.nearHundred(191));
    assertTrue(NearHundred.nearHundred(209));
    assertTrue(NearHundred.nearHundred(210));
  }

  @Test
  public void testDifferenceTo200GreatherThan10() {
    assertFalse(NearHundred.nearHundred(189));
    assertFalse(NearHundred.nearHundred(188));
    assertFalse(NearHundred.nearHundred(211));
    assertFalse(NearHundred.nearHundred(212));
  }
}
