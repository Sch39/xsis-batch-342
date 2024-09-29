package dev.sch39.bootcamp.logicphase.day08.shape.Impl;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Tags;
import org.junit.jupiter.api.Test;

@Tags({
    @Tag("day08"),
    @Tag("circle-impl")
})
public class CircleImplTest {
  private CircleImpl circle;

  @BeforeEach
  void setUp() {
    // Menginisialisasi objek CircleImpl dengan radius tertentu
    circle = new CircleImpl();
    circle.setRadius(5.0); // Contoh radius 5
  }

  @Test
  void testGetArea() {
    // Menghitung area lingkaran dengan radius 5
    double expectedArea = Math.PI * Math.pow(5.0, 2);
    assertEquals(expectedArea, circle.getArea());
  }

  @Test
  void testGetCircumference() {
    // Menghitung keliling lingkaran dengan radius 5
    double expectedCircumference = 2 * Math.PI * 5.0;
    assertEquals(expectedCircumference, circle.getCircumference());
  }
}
