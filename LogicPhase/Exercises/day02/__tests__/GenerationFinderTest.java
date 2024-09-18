package logicphase.exercises.day02.__tests__;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import logicphase.exercises.day02.GenerationFinder;

public class GenerationFinderTest {
  @Test
  public void it_should_return_generation_name_when_valid_year_entered() {
    assertEquals("The Builders", GenerationFinder.getName(1945));
    assertEquals("Baby Boomers", GenerationFinder.getName(1946));
    assertEquals("Generation X", GenerationFinder.getName(1965));
    assertEquals("Generation Y", GenerationFinder.getName(1980));
    assertEquals("Generation Z", GenerationFinder.getName(1995));
    assertEquals("Generation Alpha", GenerationFinder.getName(2010));
    assertEquals("Generation Beta", GenerationFinder.getName(2025));
  }
}
