package android.support.v7.internal.widget;

import android.view.View;

class ag
  implements Runnable
{
  ag(ScrollingTabContainerView paramScrollingTabContainerView, View paramView)
  {
  }

  public void run()
  {
    int i = this.a.getLeft() - (this.b.getWidth() - this.a.getWidth()) / 2;
    this.b.smoothScrollTo(i, 0);
    this.b.a = null;
  }
}

/* Location:           /Users/diego/Documents/workspace/dex2jar-0.0.9.15/classes_dex2jar.jar
 * Qualified Name:     android.support.v7.internal.widget.ag
 * JD-Core Version:    0.6.2
 */