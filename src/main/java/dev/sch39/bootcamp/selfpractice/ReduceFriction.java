package dev.sch39.bootcamp.selfpractice;

public class ReduceFriction {
  public static String friction(String in) {
    String[] arr = in.split("/");
    Integer above = Integer.valueOf(arr[0]),
        below = Integer.valueOf(arr[1]);
    if (above % below == 0) {
      return above / below + "";
    } else if (below % above == 0) {
      return (above / above) + "/" + (below / above);
    }
    return in;
  }

  public static void main(String[] args) {
    System.out.println(friction("3/15"));
    System.out.println(friction("12/6"));
  }
}
