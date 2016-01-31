/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PrimeBench;

import java.util.Set;
import java.util.concurrent.CopyOnWriteArraySet;

/**
 *
 * @author xavi
 */
public class Notify {
    
    public abstract class NotifyingThread extends Thread {
  private final Set<ThreadComplete> listeners
                   = new CopyOnWriteArraySet<ThreadComplete>();
  public final void addListener(final ThreadComplete listener) {
    listeners.add(listener);
  }
  public final void removeListener(final ThreadComplete listener) {
    listeners.remove(listener);
  }
  private final void notifyListeners() {
    for (ThreadComplete listener : listeners) {
      listener.notifyOfThreadComplete(this);
    }
  }
  @Override
  public final void run() {
    try {
      doRun();
    } finally {
      notifyListeners();
    }
  }
  public abstract void doRun();
}
    
    
}
