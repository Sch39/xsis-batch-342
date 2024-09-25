package selfpractice.impl;

import selfpractice.synchronouscallback.SynchronousEventListener;

public class SynchronousEventListenerImpl implements SynchronousEventListener {
  @Override
  public String onTrigger() {
    return "runned sync";
  }
}
