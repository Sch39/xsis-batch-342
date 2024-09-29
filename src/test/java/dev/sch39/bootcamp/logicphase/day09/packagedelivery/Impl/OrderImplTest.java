package dev.sch39.bootcamp.logicphase.day09.packagedelivery.Impl;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import java.util.InputMismatchException;
import java.util.Map;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Tags;
import org.junit.jupiter.api.Test;

@Tags({
    @Tag("day09"),
    @Tag("order-impl")
})
public class OrderImplTest {
  private OrderImpl order;

  @BeforeEach
  void setUp() {
    order = new OrderImpl();
  }

  @Test
  void testEstimate2DestinationOnMonday() {
    order.orderedInMonth(25);
    order.orderedInWeek(6);
    order.setNationalHoliday(26, 29);

    Map<String, Integer> result = order.estimate2Destination();

    assertEquals(1, result.get("dayInWeek"));
    assertEquals(5, result.get("dayInMonth"));
    assertEquals(1, result.get("monthInYear"));
  }

  @Test
  void testOrderedInMonthInvalidInput() {
    InputMismatchException exception = assertThrows(InputMismatchException.class, () -> {
      order.orderedInMonth(32);
    });
    assertEquals("Input range 1-31", exception.getMessage());
  }

  @Test
  void testOrderedInWeekInvalidInput() {
    InputMismatchException exception = assertThrows(InputMismatchException.class, () -> {
      order.orderedInWeek(8);
    });
    assertEquals("Range 1-7", exception.getMessage());
  }
}
