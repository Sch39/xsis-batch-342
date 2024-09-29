package dev.sch39.bootcamp.logicphase.day08.shape.Impl;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Tags;
import org.junit.jupiter.api.Test;

import dev.sch39.bootcamp.logicphase.day08.shape.Shape2DAbstract;

@Tags({
    @Tag("day08"),
    @Tag("rect-impl")
})
public class RectImplTest {
  private Shape2DAbstract shape;

  @BeforeEach
  void setUp() {
    shape = new RectImpl();
    shape.setHorizontalSide(4.0);
    shape.setVerticalSide(5.0);
  }

  @Test
  void testGetArea() {
    Double expectedArea = 20.0;
    assertEquals(expectedArea, shape.getArea());
  }

  @Test
  void testGetCircumference() {
    Double expectedCircumference = 18.0;
    assertEquals(expectedCircumference, shape.getCircumference());
  }
}
