package android.support.v4.widget;

import android.support.v4.view.as;
import android.view.View;
import java.util.ArrayList;

class x
  implements Runnable
{
  final View a;

  x(SlidingPaneLayout paramSlidingPaneLayout, View paramView)
  {
    this.a = paramView;
  }

  public void run()
  {
    if (this.a.getParent() == this.b)
    {
      as.a(this.a, 0, null);
      SlidingPaneLayout.a(this.b, this.a);
    }
    SlidingPaneLayout.a(this.b).remove(this);
  }
}

/* Location:           /Users/diego/Documents/workspace/dex2jar-0.0.9.15/classes_dex2jar.jar
 * Qualified Name:     android.support.v4.widget.x
 * JD-Core Version:    0.6.2
 */