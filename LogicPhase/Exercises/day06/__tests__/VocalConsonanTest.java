package logicphase.exercises.day06.__tests__;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThat;
import static org.junit.Assert.assertTrue;

import java.util.HashMap;
import java.util.Map;

import org.junit.Test;

import logicphase.exercises.day06.VocalConsonan;

public class VocalConsonanTest {
  @Test
  public void it_should_return_map_with_vocal_and_consonan() {
    Map<String, String> expected1 = new HashMap<String, String>() {
      {
        put("vocal", "aaee");
        put("consonan", "clmpss");
      }
    };

    Map<String, String> expected2 = new HashMap<String, String>() {
      {
        put("vocal", "aee");
        put("consonan", "cnstx");
      }
    };

    assertEquals(expected1, VocalConsonan.getVocalConsonanSorted("Sample Case"));
    assertEquals(expected2, VocalConsonan.getVocalConsonanSorted("Next Case"));
  }
}
