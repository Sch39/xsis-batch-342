package dev.sch39.bootcamp.logicphase.day08.shape.Impl;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Tags;
import org.junit.jupiter.api.Test;

@Tags({
    @Tag("day08"),
    @Tag("parallelogram-impl")
})
public class ParallelogramImplTest {
  private ParallelogramImpl parallelogram;

  @BeforeEach
  public void setUp() {
    parallelogram = new ParallelogramImpl();
    parallelogram.setHorizontalSide(4.0);
    parallelogram.setVerticalSide(3.0);
  }

  @Test
  public void testGetArea() {
    Double expectedArea = 2 * (4.0 + 3.0);
    assertEquals(expectedArea, parallelogram.getArea());
  }

  @Test
  public void testGetCircumference() {
    Double expectedCircumference = 4.0 * 3.0;
    assertEquals(expectedCircumference, parallelogram.getCircumference());
  }
}
