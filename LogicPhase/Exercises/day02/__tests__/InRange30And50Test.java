package logicphase.exercises.day02.__tests__;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

import logicphase.exercises.day02.InRange30And50;

public class InRange30And50Test {
  @Test
  public void it_should_return_false_when_one_of_input_not_in_range() {
    assertFalse(InRange30And50.isInRange(30.0f, 0.0f));
    assertFalse(InRange30And50.isInRange(0.f, 50.f));
  }

  @Test

  public void it_shoul_return_true_when_all_input_in_range() {
    assertTrue(InRange30And50.isInRange(30, 50));
    assertTrue(InRange30And50.isInRange(31, 49));
  }
}
