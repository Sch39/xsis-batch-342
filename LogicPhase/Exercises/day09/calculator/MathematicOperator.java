package logicphase.exercises.day09.calculator;

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
