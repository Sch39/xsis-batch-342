package dev.sch39.bootcamp.logicphase.day08.shape.Impl;

import dev.sch39.bootcamp.logicphase.day08.shape.Shape2DAbstract;

public class RectImpl extends Shape2DAbstract {
  public void setHorizontalSide(Double value) {
    this.horizontalSide = value;
  }

  public void setVerticalSide(Double value) {
    this.verticalSide = value;
  }

  @Override
  public Double getArea() {
    return this.horizontalSide * this.verticalSide;
  }

  @Override
  public Double getCircumference() {
    return (2 * this.horizontalSide) + (2 * this.verticalSide);
  }
}
