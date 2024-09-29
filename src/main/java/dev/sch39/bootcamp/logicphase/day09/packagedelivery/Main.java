package dev.sch39.bootcamp.logicphase.day09.packagedelivery;

import dev.sch39.bootcamp.logicphase.day09.packagedelivery.Impl.OrderImpl;

public class Main {
  public static void main(String[] args) {
    Order order = new OrderImpl();
    order.orderedInWeek(6);
    order.orderedInMonth(25);
    order.setNationalHoliday(26, 29);
    System.out.println(order.estimate2Destination());
  }
}
