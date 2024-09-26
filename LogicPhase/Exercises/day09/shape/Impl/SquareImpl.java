package logicphase.exercises.day09.shape.Impl;

import logicphase.exercises.day09.shape.Shape2DAbstract;

public class SquareImpl extends Shape2DAbstract {

  @Override
  public Double getArea() {
    return this.horizontalSide * this.verticalSide;
  }

  @Override
  public Double getCircumference() {
    return 4 * this.horizontalSide;
  }

}
