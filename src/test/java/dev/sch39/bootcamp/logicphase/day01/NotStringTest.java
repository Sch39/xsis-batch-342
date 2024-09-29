package dev.sch39.bootcamp.logicphase.day01;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

@Tag("day01")
public class NotStringTest {
  @Test
  public void testAddNotWordWhenStringNotContain() {
    assertEquals("not a", NotString.notString("a"));
    assertEquals("not ab", NotString.notString("ab"));
    assertEquals("not ab cd", NotString.notString("ab cd"));
  }

  @Test
  public void testNotAddWordWhenStringAlreadyContain() {
    assertEquals("not a", NotString.notString("not a"));
    assertEquals("not ab", NotString.notString("not ab"));
    assertEquals("not ab cd", NotString.notString("not ab cd"));
  }
}
