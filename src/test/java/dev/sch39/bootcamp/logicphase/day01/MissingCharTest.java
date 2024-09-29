package dev.sch39.bootcamp.logicphase.day01;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

@Tag("day01")
public class MissingCharTest {
  @Test
  public void testInputInRange() {
    assertEquals("ktten", MissingChar.missingChar("kitten", 1));
    assertEquals("itten", MissingChar.missingChar("kitten", 0));
    assertEquals("kittn", MissingChar.missingChar("kitten", 4));
    assertEquals("kitte", MissingChar.missingChar("kitten", 5));
  }

  @Test
  public void testInputOutOfRange() {
    assertThrows(IndexOutOfBoundsException.class, () -> {
      MissingChar.missingChar("kitten", 6);
    });
  }
}
