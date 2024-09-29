package dev.sch39.bootcamp.logicphase.day01;

public class PosNeg {
  public static boolean posNeg(int a, int b, boolean negative) {
    return negative ? (a < 0 && b < 0) : ((a < 0 && b > 0) || (a > 0 && b < 0));
  }

  public static void main(String[] args) {
    System.out.println(posNeg(1, -1, false));
    System.out.println(posNeg(-1, 1, false));
    System.out.println(posNeg(-4, -5, true));
  }
}
