package dev.sch39.bootcamp.selfpractice.roundingerrors;

public class Main {
  public static void main(String[] args) {
    double a = 0.1;
    double b = 0.2;
    double c = a + b; // Expected 0.3 but result 0.30000000000000004

    System.out.println("Result of 0.1 + 0.2 = " + c);
  }
}
