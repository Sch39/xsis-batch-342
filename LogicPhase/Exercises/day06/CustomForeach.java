package logicphase.exercises.day06;

import java.util.List;
import java.util.function.BiConsumer;

public class CustomForeach {
  private List<String> data;

  public CustomForeach(List<String> data) {
    this.data = data;
  }

  public void foreach(BiConsumer<Integer, String> callback) {
    for (int i = 0; i < this.data.size(); i++) {
      callback.accept(i, this.data.get(i));
    }
  }
}
