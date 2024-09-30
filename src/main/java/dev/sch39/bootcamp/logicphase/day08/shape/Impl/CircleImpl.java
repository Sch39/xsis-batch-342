package dev.sch39.bootcamp.logicphase.day08.shape.Impl;

import dev.sch39.bootcamp.logicphase.day08.shape.Shape2DAbstract;

public class CircleImpl extends Shape2DAbstract {
  public void setRadius(Double value) {
    this.radius = value;
  }

  @Override
  public Double getArea() {
    return Math.PI * Math.pow(this.radius, 2);
  }

  @Override
  public Double getCircumference() {
    return 2 * Math.PI * this.radius;
  }
}
