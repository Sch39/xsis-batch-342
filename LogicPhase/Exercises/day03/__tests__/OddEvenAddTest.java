package logicphase.exercises.day03.__tests__;

import static org.junit.Assert.assertArrayEquals;

import java.util.ArrayList;
import java.util.Arrays;

import org.junit.Test;

import logicphase.exercises.day03.OddEvenAdd;

public class OddEvenAddTest {
  @Test
  public void it_should_return_correct_array_list_when_given_positive_number() {
    ArrayList<String> expected1 = new ArrayList<>(
        Arrays.asList(
            "1 + 2 = 3",
            "3 + 4 = 7"));
    assertArrayEquals(expected1.toArray(), OddEvenAdd.getOperations(2).toArray());

    ArrayList<String> expected2 = new ArrayList<>(
        Arrays.asList(
            "1 + 2 = 3",
            "3 + 4 = 7",
            "5 + 6 = 11"));
    assertArrayEquals(expected2.toArray(), OddEvenAdd.getOperations(3).toArray());
  }

  @Test
  public void it_should_return_empty_array_when_given_negative_number() {
    ArrayList<String> expected = new ArrayList<>();
    assertArrayEquals(expected.toArray(), OddEvenAdd.getOperations(-2).toArray());
    assertArrayEquals(expected.toArray(), OddEvenAdd.getOperations(-3).toArray());
  }
}
