package dev.sch39.bootcamp.logicphase.day08.shape.Impl;

import dev.sch39.bootcamp.logicphase.day08.shape.Shape2DAbstract;

public class TriangleImpl extends Shape2DAbstract {
  private Boolean isSideSame;

  public TriangleImpl(Boolean isSideSame) {
    this.isSideSame = isSideSame;
  }

  @Override
  public Double getArea() {
    return 0.5 * this.horizontalSide * this.verticalSide;
  }

  @Override
  public Double getCircumference() {
    if (!this.isSideSame) {
      return this.calculateCircumferenceRightTriangle();
    }
    return this.calculateCircumferenceEquilateralTriangle();
  }

  private Double calculateCircumferenceRightTriangle() {
    return this.horizontalSide + this.verticalSide + this.diagonalSide;
  }

  private Double calculateCircumferenceEquilateralTriangle() {
    return this.horizontalSide + (2 * this.diagonalSide);
  }
}
