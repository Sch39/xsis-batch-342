package selfpractice;

import selfpractice.synchronouscallback.SynchronousEventListener;

public class SyncEventConsumer {
  private final SynchronousEventListener eventListener;

  public SyncEventConsumer(SynchronousEventListener listener) {
    this.eventListener = listener;
  }

  public String doSyncOperation() {
    System.out.println("before callback");

    return eventListener.onTrigger();
  }
}
