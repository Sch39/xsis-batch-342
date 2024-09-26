package logicphase.exercises.day09.shape.Impl;

import logicphase.exercises.day09.shape.Shape2DAbstract;

public class CircleImpl extends Shape2DAbstract {

  @Override
  public Double getArea() {
    return Math.PI * Math.pow(this.radius, 2);
  }

  @Override
  public Double getCircumference() {
    return 2 * Math.PI * this.radius;
  }

}
