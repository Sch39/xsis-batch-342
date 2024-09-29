package dev.sch39.bootcamp.logicphase.day08.calculator;

public class MathematicOperator {
  private Double result;

  public void setResult(Double number) {
    this.result = number;
  }

  public MathematicOperator plus(Double number) {
    this.result += number;
    return this;
  }

  public MathematicOperator sub(Double number) {
    this.result -= number;
    return this;
  }

  public MathematicOperator divide(Double number) {
    if (number == 0) {
      throw new ArithmeticException("Can't divide by 0!");
    }
    this.result /= number;
    return this;
  }

  public MathematicOperator mul(Double number) {
    this.result *= number;
    return this;
  }

  public Double getResult() {
    return this.result;
  }
}
