package selfpractice;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import org.junit.Test;

import selfpractice.impl.SynchronousEventListenerImpl;
import selfpractice.synchronouscallback.SynchronousEventListener;

public class SyncTest {
  @Test
  public void test1() {
    SynchronousEventListener eventListener = new SynchronousEventListenerImpl();
    SyncEventConsumer consumer = new SyncEventConsumer(eventListener);
    String result = consumer.doSyncOperation();

    assertNotNull(result);
    assertEquals("runned sync", result);
  }
}
