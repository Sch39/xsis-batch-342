package dev.sch39.bootcamp.logicphase.day08.shape.Impl;

import dev.sch39.bootcamp.logicphase.day08.shape.Shape2DAbstract;

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
