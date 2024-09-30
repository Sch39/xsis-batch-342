package dev.sch39.bootcamp.logicphase.day06;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import java.util.HashMap;
import java.util.Map;

@Tag("day06")
public class FoodPortionTest {
  @Test
  public void testGetPortions() {
    assertEquals(2.0, FoodPortion.getPortions("adult_man", 1));
    assertEquals(1.0, FoodPortion.getPortions("adult_female", 1));
    assertEquals(1.5, FoodPortion.getPortions("teenager", 1));
    assertEquals(0.5, FoodPortion.getPortions("children", 1));
    assertEquals(1.0, FoodPortion.getPortions("toddler", 1));
    assertEquals(0.0, FoodPortion.getPortions("unknown", 1)); // Person type not in the map
  }

  @Test
  public void testGetTotalPortion() {
    Map<String, Integer> persons = new HashMap<>();
    persons.put("adult_man", 3); // 3 * 2.0 = 6.0
    persons.put("adult_female", 2); // 2 * 1.0 = 2.0
    persons.put("teenager", 1); // 1 * 1.5 = 1.5
    persons.put("children", 2); // 2 * 0.5 = 1.0
    persons.put("toddler", 1); // 1 * 1.0 = 1.0

    Double totalPortion = FoodPortion.getTotalPortion(persons);
    assertEquals(13.5, totalPortion); // 6.0 + 2.0 + 1.5 + 1.0 + 1.0 = 11.5
  }

  @Test
  public void testGetTotalPortionWithOddPersons() {
    Map<String, Integer> persons = new HashMap<>();
    persons.put("adult_man", 2); // 2 * 2.0 = 4.0
    persons.put("adult_female", 3); // 3 * 1.0 = 3.0
    persons.put("teenager", 1); // 1 * 1.5 = 1.5

    // Total persons = 6 (even), so additional adult_female portion should not be
    // added.
    Double totalPortion = FoodPortion.getTotalPortion(persons);
    assertEquals(8.5, totalPortion); // 4.0 + 3.0 + 1.5 = 8.5
  }

  @Test
  public void testGetTotalPortionWithExtraAdultFemale() {
    Map<String, Integer> persons = new HashMap<>();
    persons.put("adult_man", 3); // 3 * 2.0 = 6.0
    persons.put("adult_female", 3); // 3 * 1.0 = 3.0
    persons.put("teenager", 1); // 1 * 1.5 = 1.5

    // Total persons = 7 (odd), so 3 adult_female portions should be added.
    Double totalPortion = FoodPortion.getTotalPortion(persons);
    assertEquals(13.5, totalPortion); // 6.0 + 3.0 + 1.5 + 3.0 (extra adult_female) = 13.5
  }

  @Test
  public void testCountTotalOddPerson() {
    Map<String, Integer> persons = new HashMap<>();
    persons.put("adult_man", 2);
    persons.put("adult_female", 2);
    persons.put("children", 3);

    Integer totalPersons = FoodPortion.getTotalPortion(persons).intValue(); // Expected total persons is 7
    assertEquals(7 + 2, totalPersons);
  }
}
