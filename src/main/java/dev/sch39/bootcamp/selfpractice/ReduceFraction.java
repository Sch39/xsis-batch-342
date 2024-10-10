package dev.sch39.bootcamp.selfpractice;

public class ReduceFraction {
  public static String fraction(int a, int b) {
    int originA = a,
        originB = b;
    while (b != 0) {
      int temp = b;
      b = a % b;
      a = temp;
    }

    return (originA / a) + "/" + (originB / a);
  }

  public static void main(String[] args) {
    System.out.println(fraction(8, 12));
    System.out.println(fraction(12, 8));
    System.out.println(fraction(2, 3));
  }
}
