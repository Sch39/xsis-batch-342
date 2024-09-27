package logicphase.exercises.day10.ampmconverter;

import logicphase.exercises.day10.ampmconverter.Impl.TimeConverterImpl;

public class Main {
  public static void main(String[] args) {
    Time timeConverter = new TimeConverterImpl();
    System.out.println(timeConverter.convertTime("12:35 AM"));
    System.out.println(timeConverter.convertTime("19:30"));
    System.out.println(timeConverter.convertTime("09:05"));
    System.out.println(timeConverter.convertTime("11:30 PM"));
  }
}
