package logicphase.exercises.day06.__tests__;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import logicphase.exercises.day06.Volume2Cup;

public class Volume2CupTest {
  @Test
  public void it_should_return_correct_conversion_to_cup() {
    assertEquals((Double) 5.0, Volume2Cup.getCup(1, "bottle"));
    assertEquals((Double) 25.0, Volume2Cup.getCup(1, "teapot"));
    assertEquals((Double) 2.5, Volume2Cup.getCup(1, "glass"));
  }
}
