package logicphase.exercises.day02.__tests__;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import logicphase.exercises.day02.GenerationFInder;

public class GenerationFinderTest {
  @Test
  public void it_should_return_generation_name_when_valid_year_entered() {
    assertEquals("The Builders", GenerationFInder.getName(1945));
    assertEquals("Baby Boomers", GenerationFInder.getName(1946));
    assertEquals("Generation X", GenerationFInder.getName(1965));
    assertEquals("Generation Y", GenerationFInder.getName(1980));
    assertEquals("Generation Z", GenerationFInder.getName(1995));
    assertEquals("Generation Alpha", GenerationFInder.getName(2010));
    assertEquals("Generation Beta", GenerationFInder.getName(2025));
  }
}
