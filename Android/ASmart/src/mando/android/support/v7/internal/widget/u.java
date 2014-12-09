package android.support.v7.internal.widget;

import android.view.View;

class u
  implements Runnable
{
  u(t paramt)
  {
  }

  public void run()
  {
    View localView = this.a.b();
    if ((localView != null) && (localView.getWindowToken() != null))
      this.a.c();
  }
}

/* Location:           /Users/diego/Documents/workspace/dex2jar-0.0.9.15/classes_dex2jar.jar
 * Qualified Name:     android.support.v7.internal.widget.u
 * JD-Core Version:    0.6.2
 */