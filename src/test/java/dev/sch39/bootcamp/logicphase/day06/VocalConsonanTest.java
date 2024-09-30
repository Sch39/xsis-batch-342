package dev.sch39.bootcamp.logicphase.day06;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import java.util.Map;

@Tag("day06")
public class VocalConsonanTest {
  @Test
  public void testVocalConsonanSorted_SampleCase() {
    Map<String, String> result = VocalConsonan.getVocalConsonanSorted("Sample Case");
    assertEquals("aaee", result.get("vocal"));
    assertEquals("clmpss", result.get("consonan"));
  }

  @Test
  public void testVocalConsonanSorted_NextCase() {
    Map<String, String> result = VocalConsonan.getVocalConsonanSorted("Next Case");
    assertEquals("aee", result.get("vocal"));
    assertEquals("cnstx", result.get("consonan"));
  }

  @Test
  public void testVocalConsonanSorted_EmptyString() {
    Map<String, String> result = VocalConsonan.getVocalConsonanSorted("");
    assertEquals("", result.get("vocal"));
    assertEquals("", result.get("consonan"));
  }

  @Test
  public void testVocalConsonanSorted_AllVowels() {
    Map<String, String> result = VocalConsonan.getVocalConsonanSorted("aeiou");
    assertEquals("aeiou", result.get("vocal"));
    assertEquals("", result.get("consonan"));
  }

  @Test
  public void testVocalConsonanSorted_AllConsonants() {
    Map<String, String> result = VocalConsonan.getVocalConsonanSorted("bcdfg");
    assertEquals("", result.get("vocal"));
    assertEquals("bcdfg", result.get("consonan"));
  }

  @Test
  public void testVocalConsonanSorted_MixedCase() {
    Map<String, String> result = VocalConsonan.getVocalConsonanSorted("BootCamp");
    assertEquals("aoo", result.get("vocal"));
    assertEquals("bcmpt", result.get("consonan"));
  }
}
