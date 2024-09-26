package logicphase.exercises.day09.shape.Impl;

import logicphase.exercises.day09.shape.Shape2DAbstract;

public class ParallelogramImpl extends Shape2DAbstract {

  @Override
  public Double getArea() {
    return 2 * (this.horizontalSide + this.verticalSide);
  }

  @Override
  public Double getCircumference() {
    return this.horizontalSide * this.verticalSide;
  }

}
