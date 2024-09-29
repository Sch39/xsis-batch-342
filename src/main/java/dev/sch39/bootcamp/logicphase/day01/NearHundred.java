package dev.sch39.bootcamp.logicphase.day01;

public class NearHundred {
  public static boolean nearHundred(int n) {
    return (Math.abs(n - 100) <= 10) || (Math.abs(n - 200) <= 10) ? true : false;
  }

  public static void main(String[] args) {
    System.out.println(nearHundred(93));
    System.out.println(nearHundred(90));
    System.out.println(nearHundred(89));
  }
}
