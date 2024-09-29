package dev.sch39.bootcamp.logicphase.day02;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

@Tag("day02")
public class GenerationFinderTest {
  @Test
  public void testGenerationFinderWithValidInput() {
    assertEquals("The Builders", GenerationFinder.getName(1945));
    assertEquals("Baby Boomers", GenerationFinder.getName(1946));
    assertEquals("Generation X", GenerationFinder.getName(1965));
    assertEquals("Generation Y", GenerationFinder.getName(1980));
    assertEquals("Generation Z", GenerationFinder.getName(1995));
    assertEquals("Generation Alpha", GenerationFinder.getName(2010));
    assertEquals("Generation Beta", GenerationFinder.getName(2025));
  }

  @Test
  public void testGenerationFinderWithInvalidInput() {
    assertEquals("Not defined", GenerationFinder.getName(2026));
    assertEquals("Not defined", GenerationFinder.getName(2029));
  }
}
