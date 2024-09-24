package logicphase.exercises.day06.__tests__;

import static org.junit.Assert.assertEquals;

import java.util.HashMap;
import java.util.Map;

import org.junit.Test;

import logicphase.exercises.day06.FoodPortion;

public class FoodPortionTest {
  @Test
  public void it_should_return_food_portion_for_even_person() {
    Map<String, Integer> input1 = new HashMap<>() {
      {
        put("adult_man", 4);
        put("adult_female", 1);
        put("toddler", 1);
      }
    };

    Map<String, Integer> input2 = new HashMap<>() {
      {
        put("adult_man", 4);
        put("adult_female", 1);
        put("toddler", 2);
      }
    };
    assertEquals((Double) 10.0, FoodPortion.getTotalPortion(input1));
    assertEquals((Double) 12.0, FoodPortion.getTotalPortion(input2));
  }
}
