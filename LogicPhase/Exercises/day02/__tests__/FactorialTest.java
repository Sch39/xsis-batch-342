package logicphase.exercises.day02.__tests__;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import logicphase.exercises.day02.Factorial;

public class FactorialTest {
  @Test
  public void it_return_result_of_factorial_when_number_positive() {
    assertEquals(1, Factorial.getFactorial(0));
    assertEquals(2, Factorial.getFactorial(2));
    assertEquals(6, Factorial.getFactorial(3));
  }
}
