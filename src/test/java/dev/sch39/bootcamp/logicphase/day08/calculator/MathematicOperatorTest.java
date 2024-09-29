package dev.sch39.bootcamp.logicphase.day08.calculator;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Tags;
import org.junit.jupiter.api.Test;

@Tags({
    @Tag("day08"),
    @Tag("math")
})
public class MathematicOperatorTest {
  private MathematicOperator calculator;

  @BeforeEach
  void setUp() {
    calculator = new MathematicOperator();
  }

  @Test
  void testSetResult() {
    calculator.setResult(10.0);
    assertEquals(10.0, calculator.getResult());
  }

  @Test
  void testAddition() {
    calculator.setResult(5.0);
    calculator.plus(3.0);
    assertEquals(8.0, calculator.getResult());
  }

  @Test
  void testSubtraction() {
    calculator.setResult(10.0);
    calculator.sub(4.0);
    assertEquals(6.0, calculator.getResult());
  }

  @Test
  void testDivision() {
    calculator.setResult(20.0);
    calculator.divide(5.0);
    assertEquals(4.0, calculator.getResult());
  }

  @Test
  void testMultiplication() {
    calculator.setResult(7.0);
    calculator.mul(3.0);
    assertEquals(21.0, calculator.getResult());
  }

  @Test
  void testChainedOperations() {
    calculator.setResult(10.0);
    calculator.plus(5.0).sub(3.0).mul(2.0).divide(6.0);
    assertEquals(4.0, calculator.getResult());
  }

  @Test
  void testDivisionByZero() {
    calculator.setResult(10.0);
    assertThrows(ArithmeticException.class, () -> calculator.divide(0.0));
  }
}
