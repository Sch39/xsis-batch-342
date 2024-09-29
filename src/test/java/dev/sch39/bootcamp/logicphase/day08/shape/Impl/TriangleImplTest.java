package dev.sch39.bootcamp.logicphase.day08.shape.Impl;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Tags;
import org.junit.jupiter.api.Test;

@Tags({
    @Tag("day08"),
    @Tag("triangle-impl")
})
public class TriangleImplTest {
  private TriangleImpl rightTriangle;
  private TriangleImpl equilateralTriangle;

  @BeforeEach
  void setUp() {
    rightTriangle = new TriangleImpl(false);
    equilateralTriangle = new TriangleImpl(true);
    rightTriangle.setHorizontalSide(3.0);
    rightTriangle.setVerticalSide(4.0);
    rightTriangle.setDiagonalSide(5.0);
    equilateralTriangle.setHorizontalSide(5.0);
    equilateralTriangle.setDiagonalSide(5.0);
    equilateralTriangle.setVerticalSide(4.0);
  }

  @Test
  void testGetAreaRightTriangle() {
    double expectedArea = 0.5 * 3.0 * 4.0;
    assertEquals(expectedArea, rightTriangle.getArea());
  }

  @Test
  void testGetCircumferenceRightTriangle() {
    double expectedCircumference = 3.0 + 4.0 + 5.0;
    assertEquals(expectedCircumference, rightTriangle.getCircumference());
  }

  @Test
  void testGetAreaEquilateralTriangle() {
    double expectedArea = 0.5 * 5.0 * 4.0;
    assertEquals(expectedArea, equilateralTriangle.getArea());
  }

  @Test
  void testGetCircumferenceEquilateralTriangle() {
    double expectedCircumference = 5.0 + (2 * 5.0);
    assertEquals(expectedCircumference, equilateralTriangle.getCircumference());
  }
}
