package logicphase.exercises.day10.packagedelivery;

import logicphase.exercises.day10.packagedelivery.Impl.OrderImpl;

public class Main {
  public static void main(String[] args) {
    Order order = new OrderImpl();
    order.orderedInWeek(6);
    order.orderedInMonth(25);
    order.setNationalHoliday(26, 29);
    System.out.println(order.estimate2Destination());
  }
}
