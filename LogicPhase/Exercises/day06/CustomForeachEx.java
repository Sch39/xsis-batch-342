package logicphase.exercises.day06;

import java.util.Arrays;

public class CustomForeachEx {
  public static void main(String[] args) {
    CustomForeach customList = new CustomForeach(Arrays.asList("Apple", "Banana", "Orange"));

    customList.foreach((key, value) -> {
      System.out.println("key: " + key + "\t" + "value: " + value);
    });
  }
}
