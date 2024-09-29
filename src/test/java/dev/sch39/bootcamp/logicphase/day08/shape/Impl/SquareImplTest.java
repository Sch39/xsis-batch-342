package dev.sch39.bootcamp.logicphase.day08.shape.Impl;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Tags;
import org.junit.jupiter.api.Test;

@Tags({
    @Tag("day08"),
    @Tag("square-impl")
})
public class SquareImplTest {
  private SquareImpl square;

  @BeforeEach
  public void setUp() {
    square = new SquareImpl();
    square.setHorizontalSide(5.0);
    square.setVerticalSide(5.0);
    ;
  }

  @Test
  public void testGetArea() {
    assertEquals(25.0, square.getArea());
  }

  @Test
  public void testGetCircumference() {
    assertEquals(20.0, square.getCircumference());
  }
}
