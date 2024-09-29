package dev.sch39.bootcamp.logicphase.day01;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

@Tag("day01")
public class FrontBackTest {
  @Test
  public void testWhenCharLengthEqualsOne() {
    assertEquals("a", FrontBack.frontBack("a"));
    assertEquals("b", FrontBack.frontBack("b"));
    assertEquals("c", FrontBack.frontBack("c"));
  }

  @Test
  public void testWhenCharLengthEqualsTwo() {
    assertEquals("ba", FrontBack.frontBack("ab"));
    assertEquals("cb", FrontBack.frontBack("bc"));
    assertEquals("21", FrontBack.frontBack("12"));
  }

  @Test
  public void testWhenCharLengthGreaterThanTwo() {
    assertEquals("eodc", FrontBack.frontBack("code"));
    assertEquals("oellh", FrontBack.frontBack("hello"));
  }
}
