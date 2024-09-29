package dev.sch39.bootcamp.logicphase.day03;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import java.util.ArrayList;

@Tag("day03")
public class OddEvenAddTest {
  @Test
  public void testGetOperations() {
    assertEquals(new ArrayList<String>() {
      {
        add("1 + 2 = 3");
        add("3 + 4 = 7");
        add("5 + 6 = 11");
      }
    }, OddEvenAdd.getOperations(3));

    assertEquals(new ArrayList<String>() {
      {
        add("1 + 2 = 3");
      }
    }, OddEvenAdd.getOperations(1));

    assertEquals(new ArrayList<String>(), OddEvenAdd.getOperations(0));
  }
}
