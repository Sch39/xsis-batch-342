package dev.sch39.bootcamp.logicphase.day08.shape.Impl;

import dev.sch39.bootcamp.logicphase.day08.shape.Shape2DAbstract;

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
