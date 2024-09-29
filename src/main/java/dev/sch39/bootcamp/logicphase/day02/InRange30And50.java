package dev.sch39.bootcamp.logicphase.day02;

public class InRange30And50 {
  /**
   * 
   * @param {float} num1
   * @param {float} num2
   * @return {Boolean}
   */
  public static Boolean isInRange(float num1, float num2) {
    return (num1 >= 30
        && num1 <= 50
        && num2 >= 30
        && num2 <= 50);
  }
}
